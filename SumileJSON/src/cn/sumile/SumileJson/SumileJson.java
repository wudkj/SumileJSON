package cn.sumile.SumileJson;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author <a href="http://sumile.cn">sumile</a>
 * @version 1.2
 * @Time 2016-07-18 22:22:36 修改
 * @Time 2016年1月5日09:24:16 有问题请反馈到邮箱 wudkj@163.com或在网站上面留言
 */
public class SumileJson {
    private static boolean showError = true;

    public static void showException(String e) {
        if (showError) {
//            throw new RuntimeException(e);
        }
    }

    public static <T> Object parse(String str, Class<T> cls) {
        ArrayList<KeyValuePare> listField = getAllTypeAndFields(cls);
        ArrayList<KeyValuePare> listMethod = getAllMethods(cls);
        Object object = null;
        try {
            object = cls.newInstance();
        } catch (InstantiationException e) {
            showException("类" + cls.getName() + "不能实例化，可能因为它是一个接口或者抽象类。");
        } catch (IllegalAccessException e) {
            showException("类" + cls.getName() + "的修饰符请修改为public");
        }
        JSONObject jsobj = null;
        try {
            jsobj = new JSONObject(str);
        } catch (JSONException e) {
            showException("字符串<" + str + ">不能转化为一个JSONObject,请检查它是不是用{}包住的。");
        }
        for (int i = 0; i < listField.size(); i++) {
            if (listField.get(i).getKey().toString().contains("java.util.ArrayList")) {
                // 是ArrayList的话，要转变为一个数组
                JSONArray array = null;
                try {
                    array = jsobj.getJSONArray(listField.get(i).getValue());
                } catch (JSONException e) {
                    showException("待转化字符串为" + jsobj.toString() + "字符串<" + listField.get(i).getValue() + ">不是一个JSONArray,请检查它是否是以[]包住的。");
                }
                Class c = null;
                c = getTurelyClass(listField.get(i).getKey().toString());
                if (c == null) {
                    return null;
                }
                ArrayList<T> list = null;
                list = parser_Array(array, c);
                if (containsMethods(listMethod, "set" + toUpperCaseFirstOne(listField.get(i).getValue()))) {
                    // 获得json字符串中的值
                    Method method = null;
                    try {
                        method = cls.getDeclaredMethod("set" + toUpperCaseFirstOne(listField.get(i).getValue()), ArrayList.class);
                    } catch (NoSuchMethodException e) {
                        showException("请检查" + "set" + toUpperCaseFirstOne(listField.get(i).getValue()) + "方法是否存在。");
                    } catch (SecurityException e) {
                        showException(e.toString());
                    }
                    setData(object, method, list);
                }
            } else if (listField.get(i).getKey().toString().contains("Ljava.lang.String")) {
                try {
                    JSONArray array = new JSONArray(jsobj.getString(listField.get(i).getValue()));
                    Class<?> classType = null;
                    try {
                        classType = Class.forName("java.lang.String");
                        Class c = null;
                        c = String[].class;
                        if (c == null) {
                            return null;
                        }
                        // 生成数组，指定元素类型和数组长度
                        Object data = Array.newInstance(classType, array.length());
                        for (int j = 0; j < array.length(); j++) {
                            Array.set(data, j, array.get(j));
                        }
                        Method method = null;
                        try {
                            method = cls.getDeclaredMethod("set" + toUpperCaseFirstOne(listField.get(i).getValue()), c);
                        } catch (NoSuchMethodException e) {
                            showException("请检查" + "set" + toUpperCaseFirstOne(listField.get(i).getValue()) + "方法是否存在。");
                        }
                        setData(object, method, data);
                    } catch (ClassNotFoundException e1) {
                        e1.printStackTrace();
                    }
                } catch (JSONException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } else if (!listField.get(i).getKey().toString().contains("java.lang.String")) {
                // 从json中获得值
                String jsData = null;
                try {
                    jsData = jsobj.getString(listField.get(i).getValue());
                } catch (JSONException e) {
                    showException("获得<" + listField.get(i).getValue() + ">时出错，请检查JSON文本");
                }
                Class c = null;
                try {
                    c = Class.forName(listField.get(i).getKey().toString().substring(6));
                } catch (ClassNotFoundException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                if (c == null) {
                    return null;
                }
                if (containsMethods(listMethod, "set" + toUpperCaseFirstOne(listField.get(i).getValue()))) {
                    // 获得json字符串中的值
                    Method method = null;
                    try {
                        method = cls.getDeclaredMethod("set" + toUpperCaseFirstOne(listField.get(i).getValue()), c);
                    } catch (NoSuchMethodException e) {
                        showException("请检查" + "set" + toUpperCaseFirstOne(listField.get(i).getValue()) + "方法是否存在。");
                    } catch (SecurityException e) {
                        showException(e.toString());
                    }
                    Object obj = parse(jsData, c);
                    setData(object, method, obj);
                }
            } else {
                // 是单独的属性，直接设置值
                if (containsMethods(listMethod, "set" + toUpperCaseFirstOne(listField.get(i).getValue()))) {
                    // 获得json字符串中的值
                    String jsData = null;
                    try {
                        jsData = jsobj.getString(listField.get(i).getValue());
                    } catch (JSONException e) {
                        showException("获得<" + listField.get(i).getValue() + ">时出错，请检查JSON文本");
                    }
                    Method method = null;
                    try {
                        method = cls.getDeclaredMethod("set" + toUpperCaseFirstOne(listField.get(i).getValue()), String.class);
                    } catch (NoSuchMethodException e) {
                        showException("请检查" + "set" + toUpperCaseFirstOne(listField.get(i).getValue()) + "方法是否存在。");
                    } catch (SecurityException e) {
                        showException(e.toString());
                    }
                    setData(object, method, jsData);
                }
            }
        }
        return (T) object;
    }

    private static <T> ArrayList<T> parser_Array(JSONArray array, Class<T> cls) {
        ArrayList<T> list = new ArrayList<T>();
        for (int i = 0; i < array.length(); i++) {
            JSONObject jsobj = null;
            try {
                jsobj = (JSONObject) array.get(i);
            } catch (JSONException e) {
                showException(array.toString() + "中的其中一项不是一个JSONObject");
            }
            Object obj = parse(jsobj.toString(), cls);
            list.add((T) obj);
        }
        return list;
    }

    private static Class<?> getTurelyClass(String type) {
        type = type.substring(type.indexOf("<") + 1, type.lastIndexOf(">"));
        Class c = null;
        try {
            c = Class.forName(type);
        } catch (ClassNotFoundException e) {
            showException("类" + type + "不存在，不能被实例化");
        }
        return c;
    }

    /**
     * 类中是否包含当前的方法
     */
    private static boolean containsMethods(ArrayList<KeyValuePare> list, String methodName) {
        for (int i = 0; i < list.size(); i++) {
            if (methodName.equals(list.get(i).getValue())) {
                return true;
            }
        }
        return false;
    }

    /**
     * 调用方法来设置值
     *
     * @param obj    newInstance之后的对象
     * @param method 方法
     * @param data   要设置的数据
     */
    private static void setData(Object obj, Method method, Object data) {
        try {
            method.invoke(obj, data);
        } catch (Exception e) {
            throw new RuntimeException("调用:" + method.toString() + "方法设置值:" + data + "时出错");
        }
    }

    /**
     * 获得类中所有的方法，返回值里面包括他的参数的第一个以及方法的名称
     */
    private static ArrayList<KeyValuePare> getAllMethods(Class cls) {
        ArrayList<KeyValuePare> pare = new ArrayList<KeyValuePare>();
        Method[] methods = cls.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            String methodName = methods[i].getName();
            if (methodName.contains("set")) {
                Type[] types = methods[i].getGenericParameterTypes();
                KeyValuePare k = new KeyValuePare();
                k.setKey(types[0]);
                k.setValue(methodName);
                pare.add(k);
            }
        }
        return pare;
    }

    /**
     * 获得所有的内部属性
     *
     * @return
     */
    private static Field[] baseGetAllFields(Class cls) {
        Field[] fs = cls.getDeclaredFields();
        return fs;
    }

    /**
     * 获得所有属性的值以及类型
     */
    private static ArrayList<KeyValuePare> getAllTypeAndFields(Class cls) {
        ArrayList<KeyValuePare> pare = new ArrayList<KeyValuePare>();
        Field[] fs = baseGetAllFields(cls);
        for (int i = 0; i < fs.length; i++) {
            Field f = fs[i];
            f.setAccessible(true); // 设置属性是可以访问的
            // 获得属性的类型
            Type fileType = f.getGenericType();
            // 获得属性的名称
            String fileName = f.getName();
            KeyValuePare k = new KeyValuePare();
            k.setKey(fileType);
            k.setValue(fileName);
            pare.add(k);
        }
        return pare;
    }

    public static String toUpperCaseFirstOne(String s) {
        if (Character.isUpperCase(s.charAt(0))) return s;
        else return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
    }

    public static class KeyValuePare {
        private Type key;
        private String value;

        public Type getKey() {
            return key;
        }

        public void setKey(Type key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

    }
}

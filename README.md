# 不要使用这个了，使用fastJSON或者jackson都可以，更方便好用 #

---

## 使用SumileJSON来快速解析JSON ##
version=1.2

**SumileJSON**用来解析多层嵌套的JSON格式数据 

### 模拟要解析的数据 ###
    {
    "code": "200",
    "message": "测试数据",
    "data": {
        "imgs": [
            "http://7xw2my.com1.z0.glb.clouddn.com/qiniu/2016-7/0f0b37c0786efa955beec97b56fcda6f.jpg"
        ],
        "kk": [
            {
                "sdfdsf": "sss"
            },
            {
                "sdfdsf": "ssss"
            }
        ]
    }
}
根据JSON格式创建Bean

    public class Bean {
    private String code;
    private String message;
    private MyData data;
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
 
    public static class Data2 {
        private String sdfdsf;
 
        public String getSdfdsf() {
            return sdfdsf;
        }
 
        public void setSdfdsf(String sdfdsf) {
            this.sdfdsf = sdfdsf;
        }
 
    }
 
    public static class MyData {
        private ArrayList kk;
        private String[] imgs;
        public ArrayList getKk() {
            return kk;
        }
        public void setKk(ArrayList kk) {
            this.kk = kk;
        }
        public String[] getImgs() {
            return imgs;
        }
        public void setImgs(String[] imgs) {
            this.imgs = imgs;
        }
    }
    public MyData getData() {
        return data;
    }
    public void setData(MyData data) {
        this.data = data;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
}

## Bean的创建规则 ##


1. 如果属性对应的是一个字符串或数字，其修饰符使用String
-----------------如（public String code;）

- 如果属性对应的是一个JSONArray，其修饰符使用ArrayList<Bean\>,这个里面的Bean要根据JSONArray里面的JSONObject进行编写。
-----------------如（public ArrayList<Bean2> kk;）

- 如果属性对应的是一个JSONObject，其修饰符使用对象的类名----如：(public static class MyData)
- ---------------
## 解析的调用 ##
    String co = "{\"code\":\"200\",\"message\":\"测试数据\",\"data\":{\"imgs\":[\"http://7xw2my.com1.z0.glb.clouddn.com/qiniu/2016-7/0f0b37c0786efa955beec97b56fcda6f.jpg\"],\"kk\":[{\"sdfdsf\":\"sss\"},{\"sdfdsf\":\"ssss\"}]}}";
    YingYinBeans bean = (YingYinBeans) SumileJson.parse(co, YingYinBeans.class);
    System.out.println(bean.getData().getImgs()[0]);
    System.out.println(bean.getData().getKk().get(0).getSdfdsf());

## 以上代码的输出结果 ##
    http://7xw2my.com1.z0.glb.clouddn.com/qiniu/2016-7/0f0b37c0786efa955beec97b56fcda6f.jpg
	sss
## 注意事项 ##
当前是写在Java项目里面的，直接把关键类拷贝到Android项目里面就可以了

如果遇到什么问题还望告诉我，可以发邮箱wudkj@163.com或者到[http://sumile.cn](http://sumile.cn "http://sumile.cn")留言告诉我，谢谢

# LICENSE #
----------
      Copyright   2015 wudkj
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
    http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

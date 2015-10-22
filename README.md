## 使用SumileJSON来快速解析JSON ##

**SumileJSON**用来解析多层嵌套的JSON格式数据 

### 模拟要解析的数据 ###
    {
		    "error": "0",
		    "data": [
		        {
		            "name": "1",
		            "value": [
		                {
		                    "name": "2",
		                    "value": "3"
		                },
		                {
		                    "name": "4",
		                    "value": "5"
		                }
		            ]
		        },
		        {
		            "name": "6",
		            "value": [
		                {
		                    "name": "7",
		                    "value": "8"
		                },
		                {
		                    "name": "9",
		                    "value": "10"
		                }
		            ]
		        }
		    ]
		}
根据JSON格式创建Bean

    public class Bean {
	public String error;
	public ArrayList<Bean2> data;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public ArrayList<Bean2> getData() {
		return data;
	}

	public void setData(ArrayList<Bean2> data) {
		this.data = data;
	}

	public static class Bean2 {
		public String name;
		public ArrayList<Bean3> value;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ArrayList<Bean3> getValue() {
			return value;
		}

		public void setValue(ArrayList<Bean3> value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "Bean2 [name=" + name + ", value=" + value + "]";
		}

	}

	public static class Bean3 {
		public String name;
		private String value;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "Bean3 [name=" + name + ", value=" + value + "]";
		}

	}

## Bean的创建规则 ##


1. 如果属性对应的是一个JSONObject，其修饰符使用String
-----------------如（public String error;）

- 如果属性对应的是一个JSONArray，其修饰符使用ArrayList<Bean\>,这个里面的Bean要根据JSONArray里面的JSONObject进行编写。
-----------------如（public ArrayList<Bean2> data;）

## 解析的调用 ##
    Bean s = (Bean) (SumileJson.parse(str, Bean.class));
上面的代码将JSON解析为最大的Bean，获取内部的数据可以使用下面的方法。

    System.out.println("Error:" + s.getError());
		System.out.println("data:" + s.getData().toString());
		for (int i = 0; i < s.getData().size(); i++) {
			Bean2 b2 = s.getData().get(i);
			System.out.println("Bean2--->Name:" + b2.getName());
			System.out.println("Bean2--->Value:" + b2.getValue());
			for (int j = 0; j < b2.getValue().size(); j++) {
				Bean3 b3 = b2.getValue().get(j);
				System.out.println("Bean3--->Name:" + b3.getName());
				System.out.println("Bean3--->Value:" + b3.getValue());
			}
			System.out.println();
		}

## 以上代码的输出结果 ##
    Error:0
    data:[Bean2 [name=1, value=[Bean3 [name=2, value=3], Bean3 [name=4, value=5]]], Bean2 [name=6, value=[Bean3 [name=7, value=8], Bean3 [name=9, value=10]]]]
    Bean2--->Name:1
    Bean2--->Value:[Bean3 [name=2, value=3], Bean3 [name=4, value=5]]
    Bean3--->Name:2
    Bean3--->Value:3
    Bean3--->Name:4
    Bean3--->Value:5
    
    Bean2--->Name:6
    Bean2--->Value:[Bean3 [name=7, value=8], Bean3 [name=9, value=10]]
    Bean3--->Name:7
    Bean3--->Value:8
    Bean3--->Name:9
    Bean3--->Value:10
## 注意事项 ##
当前是写在Java项目里面的，直接把关键类拷贝到Android项目里面就可以了

如果遇到什么问题还望告诉我，可以发邮箱wudkj@163.com或者到[http://sumile.cn](http://sumile.cn "http://sumile.cn")留言告诉我，谢谢

# LICENSE #
----------
      Copyright   2015wudkj
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
    http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
package cn.sumile.SumileJson;

import cn.sumile.S.Bean;
import cn.sumile.S.Bean.Bean2;
import cn.sumile.S.Bean.Bean3;

public class MainClass {
	public static String str = "{\"error\":\"0\",\"data\":[{\"name\":\"1\",\"value\":[{\"name\":\"2\",\"value\":\"3\"},{\"name\":\"4\",\"value\":\"5\"}]},{\"name\":\"6\",\"value\":[{\"name\":\"7\",\"value\":\"8\"},{\"name\":\"9\",\"value\":\"10\"}]}]}";

	public static void main(String[] args) {
		Bean s = (Bean) (SumileJson.parserField(str, Bean.class));
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
	}
//		{
//		    "error": "0",
//		    "data": [
//		        {
//		            "name": "1",
//		            "value": [
//		                {
//		                    "name": "2",
//		                    "value": "3"
//		                },
//		                {
//		                    "name": "4",
//		                    "value": "5"
//		                }
//		            ]
//		        },
//		        {
//		            "name": "6",
//		            "value": [
//		                {
//		                    "name": "7",
//		                    "value": "8"
//		                },
//		                {
//		                    "name": "9",
//		                    "value": "10"
//		                }
//		            ]
//		        }
//		    ]
//		}
}

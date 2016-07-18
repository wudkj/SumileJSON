package cn.sumile.SumileJson;

import cn.sumile.S.Bean;

public class MainClass {
	public static void main(String[] args) {
        String co = "{\"code\":\"200\",\"message\":\"������ɹ�\",\"data\":{\"imgs\":[\"http://7xw2my.com1.z0.glb.clouddn.com/qiniu/2016-7/0f0b37c0786efa955beec97b56fcda6f.jpg\"],\"kk\":[{\"sdfdsf\":\"sss\"},{\"sdfdsf\":\"ssss\"}]}}";
        Bean bean = (Bean) SumileJson.parse(co, Bean.class);
        System.out.println(bean.getData().getImgs()[0]);
        System.out.println(bean.getData().getKk().get(0).getSdfdsf());
    }
//    {
//        "code": "200",
//            "message": "������ɹ�",
//            "data": {
//        "imgs": [
//        "http://7xw2my.com1.z0.glb.clouddn.com/qiniu/2016-7/0f0b37c0786efa955beec97b56fcda6f.jpg"
//        ],
//        "kk": [
//        {
//            "sdfdsf": "sss"
//        },
//        {
//            "sdfdsf": "ssss"
//        }
//        ]
//    }
//    }
}
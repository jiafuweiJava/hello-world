package com.soap.api;

import java.util.ArrayList;

import com.tuputech.api.Api;
import com.tuputech.api.util.ConfigUtil;

import net.sf.json.JSONObject;

public class APITest {
	/**
	 * API Key 7ff2d23405949831794a68f7cfbc5974
	 * API Secret 3744f4d1f7d124282f39561b0610df927c66bb7f
	 * @param args
	 */
	public static void main(String[] args) {
		// secret id
		String secretId = "58759cb7b8ca3c419a67fe62";
		// private KEY path
		String privateKey = "F:/data/pkcs8_private_key.pem";
		// fileList imageFile or url
		ArrayList<String> fileList = new ArrayList<String>();
		// tags
		String tags[] = { "tag1", "tag2" };
		
		fileList.add("E:/2.jpg");
		//fileList.add("../test2.jpg");

		Api api = new Api(secretId, privateKey, null);
		

		JSONObject result = api.doApiTest(ConfigUtil.UPLOAD_TYPE.UPLOAD_IMAGE_TYPE, fileList,tags);

		System.out.println(result);
	}
}

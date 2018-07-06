package com.baizhi.cmfz.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class Encryption {
	public static String getRandomSalt(int len){
		char[] chs = "asdfghjklpo2368041DGWCB".toCharArray();
		Random random = new Random();
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<len;i++){
			builder.append(chs[random.nextInt(chs.length)]);
		}
		return builder.toString();
	}
	public static String encryption(String str) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] code = md.digest(str.getBytes());
		
		StringBuilder builder = new StringBuilder();
		
		for(byte b:code){

			//1.把每个自己转换成无符号数（正数）
			int c = b & 0xFF;
			// 0000 0000 1111 1111 255
			// 1110 0001 -31
			// 0000 0000 1110 0001 255
			if(c<16){
				//2.如果16以下的数字转换为十六进制以后，不足2位，追加0为前缀
				builder.append("0");
			}
			builder.append(Integer.toHexString(c));
		}
		return builder.toString();
	}
}

package com.tect.a02;

public class castExam {
	public static void main(String[] args) {
//			형변환 casting
		int intValue=65;
		char charValue=(char) intValue;//강제형변환, 큰->작은사이즈에 넣기
//		byte<char<short<int<long
		System.out.println(charValue);
		System.out.println(intValue);
		
		char charValue2='a';
		int intValue2=charValue2;//자동형변환, 묵시적 작은->큰사이즈 넣기
		System.out.println(charValue2);
		System.out.println(intValue2);
	}

}

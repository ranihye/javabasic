package com.tect.a02;

public class castExam {
	public static void main(String[] args) {
//			����ȯ casting
		int intValue=65;
		char charValue=(char) intValue;//��������ȯ, ū->��������� �ֱ�
//		byte<char<short<int<long
		System.out.println(charValue);
		System.out.println(intValue);
		
		char charValue2='a';
		int intValue2=charValue2;//�ڵ�����ȯ, ������ ����->ū������ �ֱ�
		System.out.println(charValue2);
		System.out.println(intValue2);
	}

}

package com.tech.w01;

public class StringEqualExam {
	public static void main(String[] args) {
		String strVar1="ȫ�浿";
		String strVar2="ȫ�浿";
//		��ü����
		String strVar3=new String("ȫ�浿");
		
		System.out.println(strVar1);
		System.out.println(strVar2);
		System.out.println(strVar3);
		
//		�� 
		System.out.println(strVar1==strVar2);
		System.out.println(strVar1==strVar3);
		
//		equla�Լ� ����
		System.out.println(strVar1.equals(strVar3));
		System.out.println(strVar2.equals(strVar3));
	}

}

package com.tect.a01;

public class ByteExam {
	public static void main(String[] args) 
	{
		byte var1=-128+(1);//-128~128까지만 표현이 가능
		byte var2=-30;
		byte var3=0+(-1);
//		강제형변환
		byte var4=(byte)100000;
		System.out.println("var1:"+var1);
		System.out.println("var2:"+var2);
		System.out.println("var3:"+var3);
		System.out.println("var4:"+var4);
	}

}

//한줄주석
/*
 * 
 */
// 여러줄
// 여러줄

//	 ***기본형타입***
//	정수형 타입
//byte 1byte
//char 2
//short 2
//int 4
//long 8

//	실수형 타입
//float 4 
//double 8

//	논리형 타입
//boolean 1

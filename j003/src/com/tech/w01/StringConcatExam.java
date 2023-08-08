package com.tech.w01;

public class StringConcatExam {
	public static void main(String[] args) {
		String str1="JDK"+6.0;//연산자가 아니라 문자열 결합연산 결과값은 JDK6.0/6.0은 실수라 double
		String str2=str1+"특징";//연산자가 아니라 문자열 결합연산 결과값은 JDK6.0(str1)특징 
		System.out.println(str2);
		System.out.println();
		
		String str3="jdk"+3+3+3+3.0;//앞에 문자가 있으면 문자연산,수학이 있으면 숫자연산 
		String str4=3+3+3.0+"jdk";//숫자가 먼저라서 숫자연산으로 3+3+3=9.0으로 적용
		System.out.println(str3);
		System.out.println(str4);
		
		String str5=str1.concat(str4);//concat
		System.out.println(str5);
	}
}

package com.tect.a02;

public class CharExam {
	public static void main(String[] args) {
		char c1='A'+1;//A는 아스키코드로 숫자 65+1=66=아스키코드 B
		System.out.println('A'+1);//char<int이므로 숫자로 출력됨
		System.out.println(c1);//=char이기때문에 문자 B로 출력
		System.out.println((int)c1);//=int이기때문에 숫자로 66 출력
		c1='A';//c는 A라고 정의
		System.out.println(c1);//결과값 출력
		char c2=c1;//c는 c1라고 정의
		System.out.println(c2);//결과값 출력
	}
}

package com.tect.a01;

public class intExam2 {
	public static void main(String[] args) {
//		증감연산자
		int a=10;
		int b=5;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		a=a+a;
		System.out.println("a:"+a); //=결과값은 a:20
//		a=a+(++a);	//++는 1을 증가시켜라=(10+1)+10(a)=21 결과값은 a:21
//		System.out.println("a:"+a);
//		a=a+(a++)	;//++는 1을 증가시켜라 결과값은 a:20
//		System.out.println("a:"+a);
		
		b=b++;
		System.out.println("b:"+b);
		b=b++;
		System.out.println("b:"+b);
		System.out.println("b2:"+(b++));//출력후 증가라 결과값은 6
		System.out.println("b:"+b);//위에서 증가후 출력으로 결과값은 7
//		타입의 종류는 셀수 없이 많다. 
//		사용자 타입은 개발자가 만들어낼수 있음.
	}
	
}

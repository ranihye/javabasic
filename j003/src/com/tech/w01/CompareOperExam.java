package com.tech.w01;

public class CompareOperExam {
	public static void main(String[] args) {
		int num1=10;
		int num2=10;
//		 num이 같은지 아닌지 즉 true(참)인지 false(거짓)인지 판단
		boolean result1=(num1==num2);//num1이 num2와 같은가?
		boolean result2=(num1!=num2);//num1이 num2와 다른가?
		boolean result3=(num1<=num2);//num1이 num2보다 작거나 같은가?
		
		
		System.out.println(result1);		
//		같기 때문에 즉 true(참)으로 결과 출력
		System.out.println(result2);
//		다르기 때문에 false(거짓)으로 결과 출력
		System.out.println(result3);
//		같기 때문에 즉 true(참)으로 결과 출력

		char char1='A';
		char char2='B';
		boolean result4=char1<char2;
		System.out.println(result4);
		
	}
}

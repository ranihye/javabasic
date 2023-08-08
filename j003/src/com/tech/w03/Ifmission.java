package com.tech.w03;

public class Ifmission {
	public static void main(String[] args) {
//		랜덤 정수를 입력받고 (100~200);
//		랜덤 정수가 짝수인지 홀수인지 판정하세요.

//		추가로 
//		3의 배수
//		5의 배수 판정
		int a = (int) (Math.random() * 100) + 100;

		System.out.println(a);
		
		String b = "";
		String c = "";
		
		if (a % 2 == 1) {
			b = "홀수입니다!";
		} else {
			b = "짝수입니다!";
		}
		
		System.out.println(b);
		
		if (a % 3 == 0 && a % 5 == 0) 
		{
			System.out.println("3의 배수이자 5의 배수입니다.");
		} 
		else 
		{
			if (a % 3 == 0) 
			{
				c = "3의 배수입니다!";
			} 
			else if (a % 5 == 0) 
			{
				c = "5의 배수입니다!";
			}
			
		}
		
		System.out.println(c);
	}

}

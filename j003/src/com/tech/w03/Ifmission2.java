package com.tech.w03;

public class Ifmission2 {
	public static void main(String[] args) {
//		랜덤 정수를 입력받고 (100~200);
		double innum=(int)(Math.random()*100)+100;//0~99+100해야 200이 나옴.
		System.out.println((int)innum);
//		랜덤 정수가 짝수인지 홀수인지 판정하세요.
		
		if (innum%2==0) {
			System.out.println("짝수("+(int)innum+")");
		}else {
			System.out.println("홀수");
		}
//		추가로 
//		3의 배수
		if (innum%3==0) {
			System.out.println("3의 배수("+(int)innum+")");
		}else {
			System.out.println("No 3의 배수("+(int)innum+")");
			}
//		5의 배수 판정
		if (innum%5==0) {
			System.out.println("5의 배수("+(int)innum+")");
		}else {
			System.out.println("No 5의 배수("+(int)innum+")");
			}
//		2의 배수 3의 배수 5의 배수가 동시인 숫자
		if (innum%2==0 && innum%3==0 && innum%5==0) {
			System.out.println("2,3,5의 배수("+(int)innum+")");
		}else {
			System.out.println("No 2,3,5의 배수("+(int)innum+")");
			}
	}

	}

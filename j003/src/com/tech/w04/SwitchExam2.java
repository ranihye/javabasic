package com.tech.w04;

public class SwitchExam2 {
	public static void main(String[] args) {
//		문자로 응용한 형식
		char c='가';
		
		switch (c) {
		case 'B'://키값의 경우의수
//			표현식
			System.out.println("B입니다.");
			break;//switch의 형식에서 빠져나와 default로 간다.
		case 'A'://키값의 경우의수
//			표현식
			System.out.println("A입니다.");
			break;
			
		default://예외 발생 상황 시스템의 문제가 생길수 있어 지우지 말고 넣어둬야함.
			System.out.println("에구머니나! 없는 문자입니다ㅠㅠ");
			
			break;
		}
	}

}

package com.tech.w04;

public class SwitchExam {
	public static void main(String[] args) {
//		랜덤숫자가 1~6까지 범위 숫자 추출
		int num=(int)(Math.random()*6)+1;
		System.out.println(num);//출력
//		주사위 놀이 형식
		switch (num) {
		case 1://키값의 경우의수
//			표현식
			System.out.println("1입니다.");
			break;//문장에서 빠져나오게함.
			
		case 2://키값의 경우의수
//			표현식
			System.out.println("2입니다.");
			break;
			
		case 3://키값의 경우의수
//			표현식
			System.out.println("3입니다.");
			break;
			
		case 4://키값의 경우의수
//			표현식
			System.out.println("4입니다.");
			break;
			
		case 5://키값의 경우의수
//			표현식
			System.out.println("5입니다.");
			break;
			
		case 6://키값의 경우의수
//			표현식
			System.out.println("6입니다.");
			break;

		default:
			System.out.println("나머지입니다.");
			
			break;
		}
	}

}

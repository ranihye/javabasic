package com.tech.w01;

import java.util.Scanner;

public class LeapYearExam2 {
//	서력 기원 연수가 4로 나누어 떨어지는 해는 윤년으로 한다.
//	서력 기원 연수가 4,100으로 나누어 떨어지는 해는 평년으로 한다.
//	서력 기원 연수가 4,100,400으로 나누어 떨어지는 해는 윤년으로 둔다.
	public static void main(String[] args) {

		Scanner yearnum = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		int s = yearnum.nextInt();
//		1.입력받은 숫자 출력
		System.out.println(s);
		
		
//		2.입력 받은 숫자를 조건문에 적용
//		if (s % 4 == 0) {
//			System.out.println("윤년");
//		}if (s % 4 == 0 && s % 100 == 0 ) {
//			System.out.println("평년");
//		}if (s % 4 == 0 && s % 100 == 0 && s % 400 == 0) {
//			System.out.println("윤년");
//		} else {
//			System.out.println("해당 사항 없는 년도");
//		}

		if (s % 400 == 0) {
			System.out.println("윤년1");
		}else if(s % 100 == 0 ) {
			System.out.println("평년1");
		}else if(s % 4 == 0 ) {
			System.out.println("윤년2");
		}else {
			System.out.println("평년2");
		}
			

	}
}

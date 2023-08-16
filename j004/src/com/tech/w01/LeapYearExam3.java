package com.tech.w01;

import java.util.Scanner;

public class LeapYearExam3 {
//	윤년 판단
//	계속 입력 하도록 -> 판정
//	프로그램 빠져 나오기 -1
	public static void main(String[] args) {

		Scanner yearnum = new Scanner(System.in);
		

		while (true) {//무한루프
			
			System.out.println("연도를 입력하세요");
			
			int s = yearnum.nextInt();
			System.out.println(s);
			
			if (s==-1) {
				System.out.println("프로그램 종료");
				break;
			}
			
			
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
}

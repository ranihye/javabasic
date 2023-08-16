package com.tech.w01;

import java.util.Scanner;

public class LeapYearExam4 {//while, string으로 바꾸기
//	윤년 판단
//	계속 입력 하도록 -> 판정
//	프로그램 빠져 나오기 -1
	public static void main(String[] args) {

		Scanner yearnum = new Scanner(System.in);

		while (true) {// 무한루프
			String str = "";
			System.out.println("연도를 입력하세요");

			int s = yearnum.nextInt();
			System.out.println(s + "년");

			if (s == -1) {
				System.out.println("프로그램 종료");
				break;
			}

			if (s % 400 == 0) {
				str = "윤년";
			} else if (s % 100 == 0) {
				str = "평년1";
			} else if (s % 4 == 0) {
				str = "윤년2";
			} else {
				str = "평년2";
			}

			System.out.println(s + "는 : " + str);

		}

	}
}

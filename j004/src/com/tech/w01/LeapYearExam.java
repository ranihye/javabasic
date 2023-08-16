package com.tech.w01;

import java.util.Scanner;

public class LeapYearExam {
//	서력 기원 연수가 4로 나누어 떨어지는 해는 윤년으로 한다.
//	서력 기원 연수가 4,100으로 나누어 떨어지는 해는 평년으로 한다.
//	서력 기원 연수가 4,100,400으로 나누어 떨어지는 해는 윤년으로 둔다.
	public static void main(String[] args) {

		Scanner yearnum = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		int s = yearnum.nextInt();

		String year = "";
		if (s % 4 == 0 && s % 100 == 0 && s % 400 == 0) {
			year = "윤년";
		} else if (s % 4 == 0 && s % 100 == 0 ) {
			year = "평년";
		} else if (s % 4 == 0 ) {
			year = "윤년";
		} else {
			year = "해당 사항 없는 년도";
		}
		System.out.println("입력하신 년도는 " + s + "이며, " + "년도는 " + year + "입니다.");

	}
}

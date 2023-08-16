package com.tech.w03;

import java.util.Scanner;

public class AlbaExam {
	public static void main(String[] args) {
//		시급 일한 시간수 입력
		Scanner scan=new Scanner(System.in);
		System.out.println("시급 시수 입력하세요");
		int basePay=scan.nextInt();
		int workHours=scan.nextInt();
		int Pay=basePay*workHours;
		
		System.out.println(Pay);
	}

}

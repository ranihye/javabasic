package com.tech.w03;

import java.util.Scanner;

public class AlbaExam {
	public static void main(String[] args) {
//		�ñ� ���� �ð��� �Է�
		Scanner scan=new Scanner(System.in);
		System.out.println("�ñ� �ü� �Է��ϼ���");
		int basePay=scan.nextInt();
		int workHours=scan.nextInt();
		int Pay=basePay*workHours;
		
		System.out.println(Pay);
	}

}

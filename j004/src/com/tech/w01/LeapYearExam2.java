package com.tech.w01;

import java.util.Scanner;

public class LeapYearExam2 {
//	���� ��� ������ 4�� ������ �������� �ش� �������� �Ѵ�.
//	���� ��� ������ 4,100���� ������ �������� �ش� ������� �Ѵ�.
//	���� ��� ������ 4,100,400���� ������ �������� �ش� �������� �д�.
	public static void main(String[] args) {

		Scanner yearnum = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int s = yearnum.nextInt();
//		1.�Է¹��� ���� ���
		System.out.println(s);
		
		
//		2.�Է� ���� ���ڸ� ���ǹ��� ����
//		if (s % 4 == 0) {
//			System.out.println("����");
//		}if (s % 4 == 0 && s % 100 == 0 ) {
//			System.out.println("���");
//		}if (s % 4 == 0 && s % 100 == 0 && s % 400 == 0) {
//			System.out.println("����");
//		} else {
//			System.out.println("�ش� ���� ���� �⵵");
//		}

		if (s % 400 == 0) {
			System.out.println("����1");
		}else if(s % 100 == 0 ) {
			System.out.println("���1");
		}else if(s % 4 == 0 ) {
			System.out.println("����2");
		}else {
			System.out.println("���2");
		}
			

	}
}

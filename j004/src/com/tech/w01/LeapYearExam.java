package com.tech.w01;

import java.util.Scanner;

public class LeapYearExam {
//	���� ��� ������ 4�� ������ �������� �ش� �������� �Ѵ�.
//	���� ��� ������ 4,100���� ������ �������� �ش� ������� �Ѵ�.
//	���� ��� ������ 4,100,400���� ������ �������� �ش� �������� �д�.
	public static void main(String[] args) {

		Scanner yearnum = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int s = yearnum.nextInt();

		String year = "";
		if (s % 4 == 0 && s % 100 == 0 && s % 400 == 0) {
			year = "����";
		} else if (s % 4 == 0 && s % 100 == 0 ) {
			year = "���";
		} else if (s % 4 == 0 ) {
			year = "����";
		} else {
			year = "�ش� ���� ���� �⵵";
		}
		System.out.println("�Է��Ͻ� �⵵�� " + s + "�̸�, " + "�⵵�� " + year + "�Դϴ�.");

	}
}

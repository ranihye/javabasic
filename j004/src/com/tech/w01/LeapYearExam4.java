package com.tech.w01;

import java.util.Scanner;

public class LeapYearExam4 {//while, string���� �ٲٱ�
//	���� �Ǵ�
//	��� �Է� �ϵ��� -> ����
//	���α׷� ���� ������ -1
	public static void main(String[] args) {

		Scanner yearnum = new Scanner(System.in);

		while (true) {// ���ѷ���
			String str = "";
			System.out.println("������ �Է��ϼ���");

			int s = yearnum.nextInt();
			System.out.println(s + "��");

			if (s == -1) {
				System.out.println("���α׷� ����");
				break;
			}

			if (s % 400 == 0) {
				str = "����";
			} else if (s % 100 == 0) {
				str = "���1";
			} else if (s % 4 == 0) {
				str = "����2";
			} else {
				str = "���2";
			}

			System.out.println(s + "�� : " + str);

		}

	}
}

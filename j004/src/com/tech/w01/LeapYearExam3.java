package com.tech.w01;

import java.util.Scanner;

public class LeapYearExam3 {
//	���� �Ǵ�
//	��� �Է� �ϵ��� -> ����
//	���α׷� ���� ������ -1
	public static void main(String[] args) {

		Scanner yearnum = new Scanner(System.in);
		

		while (true) {//���ѷ���
			
			System.out.println("������ �Է��ϼ���");
			
			int s = yearnum.nextInt();
			System.out.println(s);
			
			if (s==-1) {
				System.out.println("���α׷� ����");
				break;
			}
			
			
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
}

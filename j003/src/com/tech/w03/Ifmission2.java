package com.tech.w03;

public class Ifmission2 {
	public static void main(String[] args) {
//		���� ������ �Է¹ް� (100~200);
		double innum=(int)(Math.random()*100)+100;//0~99+100�ؾ� 200�� ����.
		System.out.println((int)innum);
//		���� ������ ¦������ Ȧ������ �����ϼ���.
		
		if (innum%2==0) {
			System.out.println("¦��("+(int)innum+")");
		}else {
			System.out.println("Ȧ��");
		}
//		�߰��� 
//		3�� ���
		if (innum%3==0) {
			System.out.println("3�� ���("+(int)innum+")");
		}else {
			System.out.println("No 3�� ���("+(int)innum+")");
			}
//		5�� ��� ����
		if (innum%5==0) {
			System.out.println("5�� ���("+(int)innum+")");
		}else {
			System.out.println("No 5�� ���("+(int)innum+")");
			}
//		2�� ��� 3�� ��� 5�� ����� ������ ����
		if (innum%2==0 && innum%3==0 && innum%5==0) {
			System.out.println("2,3,5�� ���("+(int)innum+")");
		}else {
			System.out.println("No 2,3,5�� ���("+(int)innum+")");
			}
	}

	}

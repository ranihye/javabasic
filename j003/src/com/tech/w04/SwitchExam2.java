package com.tech.w04;

public class SwitchExam2 {
	public static void main(String[] args) {
//		���ڷ� ������ ����
		char c='��';
		
		switch (c) {
		case 'B'://Ű���� ����Ǽ�
//			ǥ����
			System.out.println("B�Դϴ�.");
			break;//switch�� ���Ŀ��� �������� default�� ����.
		case 'A'://Ű���� ����Ǽ�
//			ǥ����
			System.out.println("A�Դϴ�.");
			break;
			
		default://���� �߻� ��Ȳ �ý����� ������ ����� �־� ������ ���� �־�־���.
			System.out.println("�����Ӵϳ�! ���� �����Դϴ٤Ф�");
			
			break;
		}
	}

}

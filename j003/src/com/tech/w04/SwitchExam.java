package com.tech.w04;

public class SwitchExam {
	public static void main(String[] args) {
//		�������ڰ� 1~6���� ���� ���� ����
		int num=(int)(Math.random()*6)+1;
		System.out.println(num);//���
//		�ֻ��� ���� ����
		switch (num) {
		case 1://Ű���� ����Ǽ�
//			ǥ����
			System.out.println("1�Դϴ�.");
			break;//���忡�� ������������.
			
		case 2://Ű���� ����Ǽ�
//			ǥ����
			System.out.println("2�Դϴ�.");
			break;
			
		case 3://Ű���� ����Ǽ�
//			ǥ����
			System.out.println("3�Դϴ�.");
			break;
			
		case 4://Ű���� ����Ǽ�
//			ǥ����
			System.out.println("4�Դϴ�.");
			break;
			
		case 5://Ű���� ����Ǽ�
//			ǥ����
			System.out.println("5�Դϴ�.");
			break;
			
		case 6://Ű���� ����Ǽ�
//			ǥ����
			System.out.println("6�Դϴ�.");
			break;

		default:
			System.out.println("�������Դϴ�.");
			
			break;
		}
	}

}

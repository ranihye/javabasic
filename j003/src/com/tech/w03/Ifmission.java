package com.tech.w03;

public class Ifmission {
	public static void main(String[] args) {
//		���� ������ �Է¹ް� (100~200);
//		���� ������ ¦������ Ȧ������ �����ϼ���.

//		�߰��� 
//		3�� ���
//		5�� ��� ����
		int a = (int) (Math.random() * 100) + 100;

		System.out.println(a);
		
		String b = "";
		String c = "";
		
		if (a % 2 == 1) {
			b = "Ȧ���Դϴ�!";
		} else {
			b = "¦���Դϴ�!";
		}
		
		System.out.println(b);
		
		if (a % 3 == 0 && a % 5 == 0) 
		{
			System.out.println("3�� ������� 5�� ����Դϴ�.");
		} 
		else 
		{
			if (a % 3 == 0) 
			{
				c = "3�� ����Դϴ�!";
			} 
			else if (a % 5 == 0) 
			{
				c = "5�� ����Դϴ�!";
			}
			
		}
		
		System.out.println(c);
	}

}

package com.tech.w04;

public class SwitchExam5 {
	public static void main(String[] args) {
		int num=(int)(Math.random()*12)+1;
			System.out.println(num+"��");
		
		switch (num) {
		
		case 3:	//3,4,5���� ������ �������� �ΰ� �ǾƷ� ����� ���. break;�� ���ָ� �������� �Ѿ��.
		case 4:	
		case 5:	System.out.println("���Դϴ�.");	break;//break�� �������´�.
		case 6:	
		case 7:	
		case 8:	System.out.println("�����Դϴ�.");	break;
		case 9:	
		case 10:	
		case 11:	System.out.println("�����Դϴ�.");	break;
		case 1:	
		case 2:	
		case 12:	System.out.println("�ܿ��Դϴ�.");	break;

		default:
			break;
		}
		

	}

}

package com.tech.w04;

public class SwitchExam4 {
	public static void main(String[] args) {
		int num=(int)(Math.random()*12);
			System.out.println(num+"��");
		
		switch (num) {
		
		case 3:	//3,4,5���� ������ �������� �ΰ� �ǾƷ� ����� ���
		case 4:	
		case 5:	System.out.println("���Դϴ�.");	break;
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

package com.tech.w04;

public class SwitchExam3 {
	public static void main(String[] args) {
		//12���� �������� 65���� ����
		int num=(int)(Math.random()*12)+65;
		System.out.println(num);
		switch (num) {
		case 65:	System.out.println("���ڴ� A");	break;
		case 66:	System.out.println("���ڴ� B");	break;
		case 67:	System.out.println("���ڴ� C");	break;
		case 68:	System.out.println("���ڴ� D");	break;
		case 69:	System.out.println("���ڴ� E");	break;
		case 70:	System.out.println("���ڴ� F");	break;
		case 71:	System.out.println("���ڴ� G");	break;
		case 72:	System.out.println("���ڴ� H");	break;
		case 73:	System.out.println("���ڴ� I");	break;
		case 74:	System.out.println("���ڴ� J");	break;
		default:
			System.err.println("�����Ӵϳ�! ���� ����!");
			break;
		}
	}
}

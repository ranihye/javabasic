package com.tech.w05;

public class IfSeason3 {
	public static void main(String[] args) {
//		�� ���� ���� �ܿ� swich�� if������ ����
		int season=(int)(Math.random()*12)+1;
		System.out.println(season);
		if (season==12 || season==1 || season==2) {
			System.out.println("�ܿ�");
		}else if (season==3 || season==4 || season==5) {
			System.out.println("��");
		}else if (season==6 || season==7 || season==8) {
			System.out.println("����");
		}else if (season==9 || season==10 || season==11) {
			System.out.println("����");
		}		
		
	}
}



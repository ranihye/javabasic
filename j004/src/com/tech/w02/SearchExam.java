package com.tech.w02;


import java.util.Scanner;

public class SearchExam {
	public static void main(String[] args) {
		int[] s= {0,10,20,30,40,50,60,70,80,90,100};
		//�������� ��ġ�� ã�ư���
		Scanner scan=new Scanner(System.in);
		
		int value,index=-1;
		
		System.out.println("Ž���� ���� �Է��ϼ���");
		
		value=scan.nextInt();
		
		System.out.println(value);
		//�迭���� �Է��� ���� ��ġ������ �˾Ƴ���
		//��¹��� 50���� 5��°�� ��ġ�մϴ�.
		
		for (int i = 0; i < s.length; i++) {
			if(value==s[i]) {
				index=i;//i�� ��ġ����
				break;
			}
			
		}
		
		System.out.println(value+" ���� "+(index+1)+"��°�� ��ġ�մϴ�");
		
	}

}

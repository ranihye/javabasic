package com.tech.w01;

import java.util.Scanner;

public class ArryExam3 {
	public static void main(String[] args) {
		
		int[] arr=new int[5];//int�� 5���� �ִ�.
		Scanner scan=new Scanner(System.in);//���� ����ڿ��� �ްڴ�
		for (int i = 0; i < arr.length; i++) {
			System.out.println("����"+(i+1)+"��° �Է��ϼ���");
			arr[i]=scan.nextInt();//����ڿ��� ���� ���� arr�� ����.
		}

//		Scanner scan=new java.util.Scanner(System.in);
//		System.out.println("���� 1��°�� �Է��ϼ���");
//		arr[0]=scan.nextInt();
//		System.out.println("���� 2��°�� �Է��ϼ���");
//		arr[1]=scan.nextInt();
//		System.out.println("���� 3��°�� �Է��ϼ���");
//		arr[2]=scan.nextInt();
//		System.out.println("���� 4��°�� �Է��ϼ���");
//		arr[3]=scan.nextInt();
//		System.out.println("���� 5��°�� �Է��ϼ���");
//		arr[4]=scan.nextInt();
		
		
		//�ݺ����� Ȱ���� ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println("����� �Է��� "+i+"��° ���ڴ� :"+arr[i]);
		}
	}

}

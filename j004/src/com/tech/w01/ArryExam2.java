package com.tech.w01;

import java.util.Scanner;

public class ArryExam2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//�迭 ����
		int[] arr=new int[5];
		//�迭�� []�� ~��°�̴�. �̶�� ǥ��� []�̰�, Ÿ��(��)int)�� ������(��)scores)���� �ᵵ �ȴ�.
		//new Ÿ��[ǥ���� ����] 
		//�� Index number�� 0���� ������. ���� �־����� ������ 0�� �⺻����. ��)5��� �ϸ� 0~4��° ���� ����. 
		//�迭 ���� ��� ���� �ִ´�.
		
		
		//�ʱ�ȭ ���� ���
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]+"\n");
//		System.out.println(scores[5]);//Index number�� 0~4���� �̱⶧���� ������
	
		//������ ����
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		arr[4]=500;
		
		
		
		//�ݺ����� Ȱ���� ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("\n"+"�迭�� ����:"+arr.length);//scores.length=�迭�� ������ �ǹ��Ѵ�.
		
		//Scanner�� Ȱ���� ������ �Է�
		
		Scanner scan=new Scanner(System.in);
		System.out.println("���� 1��°�� �Է��ϼ���");
		arr[0]=scan.nextInt();
		System.out.println("���� 2��°�� �Է��ϼ���");
		arr[1]=scan.nextInt();
		System.out.println("���� 3��°�� �Է��ϼ���");
		arr[2]=scan.nextInt();
		System.out.println("���� 4��°�� �Է��ϼ���");
		arr[3]=scan.nextInt();
		System.out.println("���� 5��°�� �Է��ϼ���");
		arr[4]=scan.nextInt();
		
		
		//�ݺ����� Ȱ���� ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println("����� �Է���"+i+"��° ���ڴ� :"+arr[i]);
		}
	}

}

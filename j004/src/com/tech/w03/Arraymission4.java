package com.tech.w03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arraymission4 {
	public static void main(String[] args) {
//		�迭�� ������ �Է� �޴´� 50~100������
//		�հ�,���,�ִ�����,�ּ����� ���
		
//		5���� ��Ҹ� ������ �� �ִ� �迭 ����
		int[] arr = new int[5];
		
//		�迭 ������ �Է¹ޱ�
		Scanner num = new Scanner(System.in);
	
//		for�� Ȱ�� �հ�,���,�ִ�����,�ּ����� ���ϱ�
		int sum=0,max=0,min=110;
		float avg=0.0f;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+"�Է�:");
			arr[i] = num.nextInt();
			//�Է�����
			if (arr[i]<50 || arr[i]>100) {
				i--;
				continue;
			}
			sum+=arr[i];
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];	
		}
		avg=(float)sum/arr.length;
		
		System.out.printf("�հ�:%d, ���%.1f",sum,avg);
		System.out.printf("\n�ּ�:%d, �ִ�:%d\n",min,max);
		
		System.out.println(Arrays.toString(arr));
	}

}

package com.tech.w03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Arraymission5 {
	public static void main(String[] args) {
//		�迭�� ������ �Է� �޴´� 50~100������
//		�հ�,���,�ִ�����,�ּ����� ���
		
//		5���� ��Ҹ� ������ �� �ִ� �迭 ����
		Integer[] arr = new Integer[5];
		
//		�迭 ������ �Է¹ޱ�
		Scanner num = new Scanner(System.in);
	
//		for�� Ȱ�� �հ�,���,�ִ�����,�ּ����� ���ϱ�
		int sum=0,max=0,min=110;
		float avg=0.0f;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"�Է�:");
			arr[i] = num.nextInt();
			//�Է�����
			if (arr[i]<50 || arr[i]>100) {
				i--;
				continue;
			}
			sum+=arr[i];
//			if(max<arr[i])
//				max=arr[i];
//			if(min>arr[i])
//				min=arr[i];	
			max=arr[i]>max ? arr[i] : max;
			min=arr[i]<min ? arr[i] : min;
			
		}
		avg=(float)sum/arr.length;
		
		System.out.printf("�հ�:%d, ���%.1f",sum,avg);
		System.out.printf("\n�ּ�:%d,\t�ִ�:%d\n",min,max);
		
		System.out.println(Arrays.toString(arr));
		
		//sort
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//������
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}

}

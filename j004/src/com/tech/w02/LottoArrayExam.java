package com.tech.w02;

import java.util.Arrays;

public class LottoArrayExam {
	public static void main(String[] args) {
		//�ζ� 
		//1~45 ����
		
		int[] arr=new int[6];

		for (int i = 0; i < arr.length; i++) {
			int num=(int)(Math.random()*45)+1;
			arr[i]=num;
			System.out.println("arr:"+i+">>"+arr[i]);
			//�ߺ�ȸ��
			for (int j = 0; j < i; j++) {
				if (arr[j]==num) {//�̹� �Էµ� ���� new�� ���� ���� �ִ°�?
					i--;//���ڸ��� ���ư���
				}
				
			}
			
		}
		
		//���� ��
		System.out.println(Arrays.toString(arr));//�迭�� ���ڷ� ����Ѵ�.
		//���� ��
		//�������� 1,2,3,4,a,b,c,d,��,��,��,�� ���� ���������� �ݴ�
		Arrays.sort(arr);//����
		System.out.println(Arrays.toString(arr));
		
		
	}

}

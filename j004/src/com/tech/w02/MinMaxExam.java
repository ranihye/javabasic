package com.tech.w02;

public class MinMaxExam {
	public static void main(String[] args) {
		// �迭���� �ּҰ� �ִ밪 ���ϱ�
		int min = 101;
		int max = 0;
		int[] arr = { 80, 40, 70, 20, 30 };

		for (int i = 0; i < arr.length; i++) {
			min = (min > arr[i]) ? arr[i] : min;
			max = (max < arr[i]) ? arr[i] : max;

//			if (min>arr[i]) 
//				min=arr[i];//������ �ٲ��ֱ�
//			if (max<arr[i]) 
//				max=arr[i];//������ �ٲ��ֱ�
		}

		System.out.println("�ּҰ�:" + min);
		System.out.println("�ִ밪:" + max);

	}
}

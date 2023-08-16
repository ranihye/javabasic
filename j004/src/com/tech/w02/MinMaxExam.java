package com.tech.w02;

public class MinMaxExam {
	public static void main(String[] args) {
		// 배열안의 최소값 최대값 구하기
		int min = 101;
		int max = 0;
		int[] arr = { 80, 40, 70, 20, 30 };

		for (int i = 0; i < arr.length; i++) {
			min = (min > arr[i]) ? arr[i] : min;
			max = (max < arr[i]) ? arr[i] : max;

//			if (min>arr[i]) 
//				min=arr[i];//작을때 바꿔주기
//			if (max<arr[i]) 
//				max=arr[i];//작을때 바꿔주기
		}

		System.out.println("최소값:" + min);
		System.out.println("최대값:" + max);

	}
}

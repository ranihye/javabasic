package com.tech.w03;

import java.util.Scanner;

public class Arraymission2 {
	public static void main(String[] args) {
//		10개의 요소를 저장할 수 있는 배열 선언
//		배열에 성적을 입력 받는다 50~100점사이
//		합계,평균,최대점수,최소점수 출력
//		배열 선언은 입력받기
		
		int[] arr = new int[5];
		
		Scanner num = new Scanner(System.in);
	
//		for문 활용 합계,평균,최대점수,최소점수 구하기
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+"입력:");
			arr[i] = num.nextInt();
		}
		
		int sum=0,max=0,min=110;
		float avg=0.0f;
		
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];	
		}
		avg=(float)sum/arr.length;
		
		System.out.printf("합계는 %d이고, 평균은 %.1f", sum,avg);
		System.out.printf("\n최대값은 %d이고, 최소값은 %d이다.", max,min);
		
//		System.out.println("sum: " + sum);
//		System.out.println("max: " + max);
//		System.out.println("min: " + min);
//		System.out.println("avg: " + avg);
		
		System.out.println();
	}

}

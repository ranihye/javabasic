package com.tech.w03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arraymission4 {
	public static void main(String[] args) {
//		배열에 성적을 입력 받는다 50~100점사이
//		합계,평균,최대점수,최소점수 출력
		
//		5개의 요소를 저장할 수 있는 배열 선언
		int[] arr = new int[5];
		
//		배열 선언은 입력받기
		Scanner num = new Scanner(System.in);
	
//		for문 활용 합계,평균,최대점수,최소점수 구하기
		int sum=0,max=0,min=110;
		float avg=0.0f;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+"입력:");
			arr[i] = num.nextInt();
			//입력제한
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
		
		System.out.printf("합계:%d, 평균%.1f",sum,avg);
		System.out.printf("\n최소:%d, 최대:%d\n",min,max);
		
		System.out.println(Arrays.toString(arr));
	}

}

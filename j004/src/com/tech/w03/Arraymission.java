package com.tech.w03;

import java.util.Scanner;

public class Arraymission {
	public static void main(String[] args) {
//		10개의 요소를 저장할 수 있는 배열 선언
//		배열에 성적을 입력 받는다 50~100점사이
//		합계,평균,최대점수,최소점수 출력
//		배열 선언은 입력받기
//		for문 활용 합계,평균,최대점수,최소점수 구하기
		
		Scanner num = new Scanner(System.in);
		
		int[] arr = new int[10];

		int total = 0;
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("성적을 입력하세요");
			arr[i] = num.nextInt();
		
			if (arr[i] < 50 || arr[i] > 100) {
				System.out.println("다시 입력하세요.");
				i--;
			}

			if (min < arr[i])
				min = arr[i];// 작을때 바꿔주기
			if (max > arr[i])
				max = arr[i];

			total += arr[i];
		}

		System.out.println("성적의 합계는 " + total);
		System.out.println("성적의 평균은 " + total / (float) arr.length);
		System.out.println("최소 점수는 " + min);
		System.out.println("최대 점수는 " + max);

	}

}

package com.tech.w02;

import java.util.Arrays;

public class TwoDemenArray2 {
	public static void main(String[] args) {
		//이차원 배열 선언
		//5,4 arr을 만들어서
		int[][] arr=new int[5][4];
		//값을 1씩 증가된 값이 배열에 쌓이고
		//for문을 활용
		int cnt=1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=cnt;
				cnt++;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();

		}
		//그 결과를 출력
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}

}

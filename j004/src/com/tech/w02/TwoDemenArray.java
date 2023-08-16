package com.tech.w02;

public class TwoDemenArray {
	public static void main(String[] args) {
		//이차원 배열 선언  행(세로/줄/Row) 열(가로/칸/Column) (가로한줄/Racord)
		int[] [] arr=new int[4] [3];//행렬의 갯수[]
		//이차원 배열의 길이
		System.out.println(arr.length);//행의 갯수를 이차원 배열에서는 length
		System.out.println(arr[0].length);//일차원 배열의 갯수
		//데이터 대입
		arr[0][0]=10;arr[0][1]=20;arr[0][2]=30;
		arr[1][0]=40;arr[1][1]=50;arr[1][2]=60;
		arr[2][0]=70;arr[2][1]=80;arr[2][2]=90;
		arr[3][0]=100;arr[3][1]=110;arr[3][2]=120;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
		
	}

}

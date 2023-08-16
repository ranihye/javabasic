package com.tech.w02;

public class TwoDemenArray3 {
	public static void main(String[] args) {
		//이차원 배열 선언
		//5,4 arr을 만들어서
//		int[][] arr=new int[5][4];
		int[][] arr=new int[5][];//열의 갯수는 생략 가능
		arr[0]=new int[1];
		arr[1]=new int[2];
		arr[2]=new int[3];
		arr[3]=new int[4];
		arr[4]=new int[5];
		
		
		
		//값을 1씩 증가된 값이 배열에 쌓이고
		//for문을 활용
		int cnt=1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=cnt;
				cnt++;
			}

		}
	
		//그 결과를 출력
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}

}

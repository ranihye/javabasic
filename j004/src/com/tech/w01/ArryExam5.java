package com.tech.w01;

public class ArryExam5 {
	public static void main(String[] args) {
//		int[] arr=new int[5];
//		배열 선언의 다른방법
		int[] arr = { 10, 20, 30, 40, 50 };// 대입값
		System.out.println("길이 : " + arr.length);// 데이터의 갯수

//		출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

//		한줄 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

		
		System.out.println("\n===============");

//		한출 출력인데 ,를 없애고
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) 
				System.out.print(arr[i] + ",");
			 else 
				System.out.print(arr[i]);
		}
		
		
		System.out.println("\n===============");

//		한출 출력인데 ,를 없애고
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) //i는 arr.length(데이터의 갯수가 5이니 5-1=4[40])이 맞는가?
				System.out.print(arr[i] + ",");
			 else 
				System.out.print(arr[i]);
		}
		
		
		
		
		
		
		

	}
}

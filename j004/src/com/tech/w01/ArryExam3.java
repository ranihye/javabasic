package com.tech.w01;

import java.util.Scanner;

public class ArryExam3 {
	public static void main(String[] args) {
		
		int[] arr=new int[5];//int는 5개가 있다.
		Scanner scan=new Scanner(System.in);//값을 사용자에게 받겠다
		for (int i = 0; i < arr.length; i++) {
			System.out.println("숫자"+(i+1)+"번째 입력하세요");
			arr[i]=scan.nextInt();//사용자에게 받은 값은 arr에 들어간다.
		}

//		Scanner scan=new java.util.Scanner(System.in);
//		System.out.println("숫자 1번째를 입력하세요");
//		arr[0]=scan.nextInt();
//		System.out.println("숫자 2번째를 입력하세요");
//		arr[1]=scan.nextInt();
//		System.out.println("숫자 3번째를 입력하세요");
//		arr[2]=scan.nextInt();
//		System.out.println("숫자 4번째를 입력하세요");
//		arr[3]=scan.nextInt();
//		System.out.println("숫자 5번째를 입력하세요");
//		arr[4]=scan.nextInt();
		
		
		//반복문을 활용한 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println("당신이 입력한 "+i+"번째 숫자는 :"+arr[i]);
		}
	}

}

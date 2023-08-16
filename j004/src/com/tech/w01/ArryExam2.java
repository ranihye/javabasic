package com.tech.w01;

import java.util.Scanner;

public class ArryExam2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//배열 선언
		int[] arr=new int[5];
		//배열의 []는 ~번째이다. 이라고 표기는 []이고, 타입(예)int)나 변수명(예)scores)옆에 써도 된다.
		//new 타입[표현할 갯수] 
		//↓ Index number는 0부터 시작함. 값을 넣어주지 않으면 0이 기본값임. 예)5라고 하면 0~4번째 까지 나옴. 
		//배열 갯수 대로 값을 넣는다.
		
		
		//초기화 없이 출력
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]+"\n");
//		System.out.println(scores[5]);//Index number는 0~4까지 이기때문에 에러남
	
		//데이터 대입
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		arr[4]=500;
		
		
		
		//반복문을 활용한 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("\n"+"배열의 길이:"+arr.length);//scores.length=배열의 갯수를 의미한다.
		
		//Scanner를 활용한 데이터 입력
		
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자 1번째를 입력하세요");
		arr[0]=scan.nextInt();
		System.out.println("숫자 2번째를 입력하세요");
		arr[1]=scan.nextInt();
		System.out.println("숫자 3번째를 입력하세요");
		arr[2]=scan.nextInt();
		System.out.println("숫자 4번째를 입력하세요");
		arr[3]=scan.nextInt();
		System.out.println("숫자 5번째를 입력하세요");
		arr[4]=scan.nextInt();
		
		
		//반복문을 활용한 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println("당신이 입력한"+i+"번째 숫자는 :"+arr[i]);
		}
	}

}

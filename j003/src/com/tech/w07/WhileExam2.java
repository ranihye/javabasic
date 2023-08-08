package com.tech.w07;

public class WhileExam2 {
	public static void main(String[] args) {
//		1~10합계
		int i=1;//i는 정수 1이다.
		int sum=0;//sum은 정수 0이다.
		//조건이 만족하지 않으면 실행이 안된다. 
		while (i<=10) {//i가 10보다 작거나 같을때까지 반복한다.
			System.out.println(i);//i 출력
			sum=sum+i;//sum은 sum+i다.
			i++;//
		}
		System.out.println("sum:"+sum);//sum 출력
	}

}

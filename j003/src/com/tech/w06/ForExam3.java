package com.tech.w06;

public class ForExam3 {
	public static void main(String[] args) {
		//For문의 반복문으로 합계 구하기
		//1~10 합계
		int sum=1;//누적변수
		for (int i = 1; i < 10; i++) {
			//누적
//			sum=sum+i; 위 아래 같은 표현
//			sum+=i;
			sum=sum*i;
//			sum*=i;
		}
		//최종 줄력
		System.out.println("tot : "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		
//		For(초기값;조건식;증감식){
//			문장
//		}
//		실행순서 : 초기값->조건식->문장->증감식->[조건식->문장->증감식]조건에 맞을때까지 증감됨
		//증가 for문
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(i+"반복");
//			}
//		
//		//증가 for문
//		for (int i = 0; i <= 10; i=i+2) {
//			System.out.println(i+"반복");
//			}
//		
//		//감소 for문
//		for (int i = 10; i < 0; i--) {
//			System.out.println(i+"반복");	
//			} 
	}

}

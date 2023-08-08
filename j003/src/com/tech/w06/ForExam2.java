package com.tech.w06;

public class ForExam2 {
	public static void main(String[] args) {
//		
//		For(초기값;조건식;증감식){
//			문장
//		}
//		실행순서 : 초기값->조건식->문장->증감식->[조건식->문장->증감식]조건에 맞을때까지 증감됨
		// 증가 for문
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + "반복");
		}
		System.out.println("-------------");
		// 증가 for문
		for (int i = 0; i <= 10; i = i + 2) {// 2씩 늘어남
			System.out.println(i + "반복");
		}
		System.out.println("-------------");
		// 감소 for문
		for (int i = 10; i > 0; i--) {
			System.out.println(i + "반복");
		}
	}
}

package com.tech.w05;

public class ForExam {
	public static void main(String[] args) {
//		
//		For(초기값;조건식;증감식){
//			문장
//		}
//		실행순서 : 초기값->조건식->문장->증감식->[조건식->문장->증감식]조건에 맞을때까지 증감됨
		for (int i = 0; i <= 10; i++) {
			System.out.println(i+"반복");
			if (i==5) {
				break;//반복문을 탈출
			}
			
		}
	}

}

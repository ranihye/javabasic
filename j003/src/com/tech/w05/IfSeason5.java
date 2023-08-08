package com.tech.w05;

public class IfSeason5 {
	public static void main(String[] args) {
//		봄 여름 가을 겨울 swich를 if문으로 수정
		int season=(int)(Math.random()*12)+1;
		System.out.println(season);
		if (season==12 | season==1 | season==2) {//|는 1,0로 비트연산자로 계산하는것이고, ||두개 사용하면 논리 연산으로 T,F로 구분한다.
			System.out.println("겨울");
		}else if (season>=3 & season<=5) {
			System.out.println("봄");
		}else if (season>=6 & season<=8) {
			System.out.println("여름");
		}else if (season>=9 & season<=11) {
			System.out.println("가을");
		}		
		
	}
}



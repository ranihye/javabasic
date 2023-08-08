package com.tech.w05;

public class ForExam2 {
	public static void main(String[] args) {
//		
//		For(초기값;조건식;증감식){
//			문장
//		}
//		실행순서 : 초기값->조건식->문장->증감식->[조건식->문장->증감식]조건에 맞을때까지 증감됨
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(i+"반복");
//			if (i==5) {
//				break;//반복문을 탈출
//			}
//		}
		
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 3; j++) {
//				if(i==3) {
//					break;
//				}
//				System.out.println("i:"+i+" j:"+j);
//				
//				}
//			}
		
		gotolabe:
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 3; j++) {//안쪽 for문이 만족이 될시 바깥쪽 for문이 실행됨.
				if(i==3) {
//					break;
					break gotolabe;
				}
				System.out.println("i:"+i+" j:"+j);
				}
			}
		}
	}



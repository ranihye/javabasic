package com.tech.w06;

public class ForGuGuExam3 {
	public static void main(String[] args) {
		//2~9단 출력
		//for문 중첩
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d*%d=%d\t ",j,i,i*j);//대입문장. 뒤에서 앞을 대입한다. 
			}
			System.out.println();
		}
	}
}


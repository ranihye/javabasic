package com.tech.w06;

public class ForExam4 {
	public static void main(String[] args) {
		// For문의 반복문으로 합계 구하기
		// 짝수의 합계 even, 홀수의 합계 odd
		int even = 0, odd = 0;
		for (int i = 1; i < 10000; i++) {
			if (i % 2 == 0) {// 짝수
				even += i;// 한문장일때 중괄호 생략가능
			} else
				odd += i;

		}
		System.out.println("짝수 : " + even);
		System.out.println("홀수 : " + odd);

		even = 0;
		odd = 0;
		for (int i = 0; i < 10; i = i + 2) {
			System.out.println(i);
			even += i;
		}
		System.out.println(even);
	}

}

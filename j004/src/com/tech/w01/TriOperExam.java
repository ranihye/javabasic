package com.tech.w01;

public class TriOperExam {
	public static void main(String[] args) {
		// 삼항 연산자
		// 조건식 ? 조건이 참일때 출력 : 조건이 거짓일때 출력
		// 총 3가지를 출력한다. 조건,참,거짓의 결과값

//		System.out.println((10<50)?10:20);
		// 출력문:(10이 50보다 큰가?)참이면 10: 거짓이면 20
		// 거짓이기 때문에 거짓 부분에 20이 출력된다.

		int a = (10 < 50) ? 10 : 20;// 출력되는 값이 정수이기 때문에 int로 선언
		System.out.println(a);
		// 위는 대입이 없이 하였고, 대입을 하여 출력할수도 있다.

		String b = (10 > 5) ? "맞다" : "틀리다";//출력되는 값이 문자이기 때문에 String로 선언
		System.out.println(b);

		char c = (10 > 5) ? 'O' : 'X';//출력되는 값이 한글자이기 때문에 char로 선언
									  //만약 String으로 하려면 ""를 써주어야함.
		System.out.println(c);

	}

}

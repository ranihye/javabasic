package com.tech.w02;

public class missoin {
	public static void main(String[] args) {
//		삼각형의 면적 구하기
//		사격형의 면적 구하기
//		가로 100 width
//		세로 50 height
//		변수명 
//		면적 recsquare, triangle

		int width=5;
		int height=5;
		int quadrangle=width*height;
		int triangle=width*height/2;
//		int로 계산하면 정수이기 때문에 소수점이 안나옴.
//		float recsquare1=width*height;
//		float trisqeare1=width*height/2.0f;
//		flaot는 실수라서 실수로 곱해줘야되고 꼭 뒤에 f를 붙인다
		System.out.println("사각형의 면적:"+quadrangle);
		System.out.println("삼각형의 면적:"+triangle);
	}

}

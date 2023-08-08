package com.tect.a02;

public class longExam {
	public static void main(String[] args) {
		long ver1=10;// 자동형변환:값이 변수보다 크면 자동형변환됨. 묵시적 형변환
//						값이 변수보다 작으면 강제형변환을 해줘야됨. 명시적 형변환
		long ver2=10L;
	
		
		
//		byte<char<short<int<long
		
		System.out.println("ver1 :"+ver1);
		System.out.println("ver2 :"+ver2);
		
		//long ver3=10000000000;
		long ver4=10000000000L;//long은 L을 표시함
		System.out.println("ver4 :"+ver4);
	}

}

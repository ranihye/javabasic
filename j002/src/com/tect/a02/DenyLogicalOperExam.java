package com.tect.a02;

public class DenyLogicalOperExam {
	public static void main(String[] args) {
		//boolean, not 함수 이해
		boolean play1=false;
		boolean play2=false;
		System.out.println(play1);

		//		역함수 not
		
		play1=!play1;//play는 true !는 반대로 표현
		System.out.println(play1);
		
		boolean result1=play1 || play2;//||는 or ~이거나
		System.out.println(result1);
		boolean result2=play1 && play2;//&&는 and  그리고
		System.out.println(result2);
		
		play1=!(!play1);//play는 true !는 반대로 표현 역함수를 걸었음
		System.out.println(play1);
		
	}	

}

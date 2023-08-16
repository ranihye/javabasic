package com.tech.w03;

import java.util.Scanner;

public class ArrayNameHeightExam5 {
	public static void main(String[] args) {
		//변수의 명명규칙
		
		//필수 조건
		//	-하나 이상의 문자
		//	-*첫번째 글자는 문자가, _ , $ 가능
		//	-길이에 제한없다
		//	-*자바의 키워드 사용불가 예)int,public
		
		//권장 사항
		//	-첫 글자를 소문자 명사
		//	-의미를 담고 축약
		//방법 합성어
		//	student score 두단어를 사용하고, 합성어일때 표현하는법
		//	studentScore	camel type -주로 사용하는 타입
		//	student_Score	snake type
		
		
		
		
//		배열1 names에 이름 5인을 미리 입력하고
//		배열2 heights 각각 이름의 키를 입력받아
//		배열1에 이름에 해당하는 키를 출력하시오
//		신장 토탈, 신장평균 출력
		
		
		Scanner n=new Scanner(System.in);
		System.out.println("인원수를 입력");
		int cntPerson=n.nextInt();//camel type의 예
		
		String[] names= new String[cntPerson];	
		
		int[] heights=new int[names.length];
		
		int total=0;
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("이름을 입력하시오");
			names[i]=n.next();
			System.out.println("키를 입력하시오");
			heights[i]=n.nextInt();
			total+=heights[i];
		}	
			
		
		System.out.println("키의 합계:"+total);
		System.out.println("키의 평균:"+total/(float)heights.length);
}
}
package com.tech.w03;

import java.util.Scanner;

public class ArrayNameHeightExam {
	public static void main(String[] args) {
//		배열1 names에 이름 5인을 미리 입력하고
//		배열2 heights 각각 이름의 키를 입력받아
//		배열1에 이름에 해당하는 키를 출력하시오
//		신장 토탈, 신장평균 출력
		String[] names= {"tom1","tom2","tom3","tom4","tom5"};//이름 선언
		int[] heights=new int[5];//배열 선언
		
		Scanner n=new Scanner(System.in);//입력 받겠다
		
		int total=0;
		
		for (int i = 0; i < heights.length; i++) {
			System.out.println("키를 입력하시오");
			heights[i]=n.nextInt();
			total+=heights[i];//누적
		}
		
		
		for (int i = 0; i < heights.length; i++) {
			System.out.println(names[i]+"의 키는:"+heights[i]);
		}
		
		System.out.println("키의 합계:"+total);
		System.out.println("키의 합계:"+total/(float)heights.length);
	
	}	

}

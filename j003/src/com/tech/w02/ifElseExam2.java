package com.tech.w02;

public class ifElseExam2 {
	public static void main(String[] args) {
//		point를 받기 =  800;
//		
//		Point가 900이상 leve11
//		800이상 leve12
//		700이상 leve13
//		나머지는 leve0	
//		이상>= 이하<= 미만< 초과> 
		
		int point=800;
		if(point>=900) {
			System.out.println("leve11");
		}else if(point>=800) {
			System.out.println("leve12");
		}else if(point>=700) {
			System.out.println("leve11");
		}else {
			System.out.println("leve0");
		}	
	}
}
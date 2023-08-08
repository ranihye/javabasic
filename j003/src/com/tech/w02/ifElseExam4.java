package com.tech.w02;

public class ifElseExam4 {
	public static void main(String[] args) {
//		point를 받기 =  800;
//		
//		Point가 900이상 leve11
//		800이상 leve12
//		700이상 leve13
//		나머지는 leve0
		
//		이상>= 이하<= 미만< 초과> 
		
		
		int point=800;
		String pont="";
		if(point>=900) {
			pont="leve11";
		}else if(point>=800) {
			pont="leve12";
		}else if(point>=700) {
			pont="leve13";
		}else {
		}	
		System.out.println(pont);
	}
}
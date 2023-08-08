package com.tech.w02;

public class ifElseExam3 {
	public static void main(String[] args) {
		
		int score=80;
		String grade="";//초기화
		//String grade="";//초기화
		if (score>=90) {
				grade="90점대 점수";
				
			}else if(score>=80){
				grade="80점대 점수";
				
			}else if(score>=70) {
				grade="70점대 점수";
				
			}else if(score>=60) {
				grade="60점대 점수";
				
			}else if(score>=50) {
				grade="50점대 점수";
				
			}else {
				grade="나머지";	
			}
		System.out.println(grade);

	}
}
package com.tech.w02;

public class ifElseExam3 {
	public static void main(String[] args) {
		
		int score=80;
		String grade="";//�ʱ�ȭ
		//String grade="";//�ʱ�ȭ
		if (score>=90) {
				grade="90���� ����";
				
			}else if(score>=80){
				grade="80���� ����";
				
			}else if(score>=70) {
				grade="70���� ����";
				
			}else if(score>=60) {
				grade="60���� ����";
				
			}else if(score>=50) {
				grade="50���� ����";
				
			}else {
				grade="������";	
			}
		System.out.println(grade);

	}
}
package com.tech.w03;

public class IfNestedExam {
	//중첩if(if문안에 if를 쓴다)
	public static void main(String[] args) {
		int score=(int) (Math.random()*50)+50;//int는 정수인데 random은 실수이니 0*50이 되어 계속 0만 나옴. 꼭 괄호 해줘야됌.
//		System.out.println(score);
	//평점 매기기 A+=95 A=90 B+=85 B=80...
//		int score1=90;
		String grade="";
		System.out.println("점수는 "+score+"점,");
		if (score>=90) {
			if (score>95) {
				grade="A+";
			}
			else {
				grade="A";	
			}
			
		}else if (score>=80) {
			if (score>85) {
				grade="B+";
			}
			else {
				grade="B";
				
			}
			
		}else if (score>=70) {
			if (score>75) {
				grade="C+";
			}
			else {
				grade="C";
				
			}
		}else if (score>=60) {
			if (score>60) {
				grade="D+";
			}
			else {
				grade="D";
				
			}
		}else {
			grade="F";
		}
		System.out.println("등급은 "+grade+" 입니다.");
		
	}
}
package com.tech.w02;

public class ifElseExam {
	public static void main(String[] args) {
		int score=50;//score는 50이다.
		if (score>=90) {//if,만약에(score가 90보다 크거나 같으면)
			System.out.println("90대 점수");//출력값
			}else if(score>=80){
			System.out.println("80점대 점수");
			}else if(score>=70) {
			System.out.println("70점대 점수");
			}else if(score>=60) {
			System.out.println("60점대 점수");
			}else if(score>=50) {
			System.out.println("50점대 점수");
			}else {//위 조건이외의 점수
			System.out.println("60점 미만 점수");
			}
	}
}
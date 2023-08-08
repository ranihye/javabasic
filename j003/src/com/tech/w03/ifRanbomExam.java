package com.tech.w03;

public class ifRanbomExam {
	public static void main(String[] args) {
//		랜덤
//		double score=Math.random();//넘지 않은 0.0~0.999999999999...까지 나온다.
//		System.out.println(score);
		
		
//		미션 값이 50이상이 출력되도록!
//		조건:넓은 범위의 랜덤영역에서 
		
		double score=Math.random();
//		score=Math.random()+50; //50까지으로 넓은 값이 나옴
//		score=(Math.random()*50)+50; //넓은 스펙스럼으로 나옴
//		score=(int)((Math.random()*50)+50); //소수점 하나만 나옴
		
//		System.out.println(score);
		
//		평점매기기
//		90점 이상 A 80점이상 
		score=(Math.random()*50)+50;
		System.out.println((int)score);
		String grade="";
		if (score>=90) {
			grade="A등급";	
		}else if (score>=80) {
			grade="B등급";	
		}else if (score>=70) {
			grade="C등급";	
		}else if (score>=60) {
			grade="D등급";
		}else {//무조건 받아진다.
			grade="F등급";
		}
		System.out.println("등급:"+grade);
		
//		+ 짝홀수 구분
//		%는 나머지 연산자
		if ((int)score%2==1) {//score를 2를 나눈 나머지가 1인가?
			System.out.println("홀수다");
		}else {
			System.out.println("짝수다");
			
		}
		
	}

}

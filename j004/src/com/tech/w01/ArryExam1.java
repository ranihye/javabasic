package com.tech.w01;

public class ArryExam1 {
	public static void main(String[] args) {
		//기존의 변수 선언 방법
//		int score1=0;
//		int score2=0;
//		int score3=100;
//		int score4=100;
//		int score5=20;
//		
//		System.out.println(score1);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
//		System.out.println(score5);
		
		
		
		//배열 선언
		int[] scores=new int[5];
		//배열은 ~번째이다. 이라고 표기는 []이고, 타입(예)int)나 변수명(예)scores)옆에 써도 된다.
		//new 타입[표현할 갯수] 
		//↓ Index number는 0부터 시작함. 값을 넣어주지 않으면 0이 기본값임. 예)5라고 하면 0~4번째 까지 나옴. 
		scores[0]=10;
		scores[1]=20;
		scores[2]=30;
		scores[3]=40;
		scores[4]=50;
		//scores의 배열 갯수 대로 값을 넣는다.
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]+"\n");
//		System.out.println(scores[5]);//Index number는 0~4까지 이기때문에 에러남
	
		
		//반복문을 활용한 출력
		for (int i = 0; i < scores.length; i++) {//여기서 i++는 
			System.out.println(scores[i]);
		}
		
		System.out.println("\n"+scores.length);//scores.length=배열의 갯수를 의미한다.
		
		
	}

}

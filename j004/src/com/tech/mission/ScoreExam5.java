package com.tech.mission;

import java.util.Scanner;

public class ScoreExam5 {
	public static void main(String[] args) {
		//배열사이즈는 5
		//점수를 받아 배열에 저장
		//평균 합계 인원 출력
		//메일 베목 : 배열 성적 처리
		//배열로 총점매기기
		//입력제한 (0~100)
		int[] scores=new int[5];
		Scanner scores1 = new Scanner(System.in);

		int sum=0;
		float avg=1.0f;
		boolean flag;
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1)+"번 점수 입력:");
			scores[i]=scores1.nextInt();
			
//			입력 데이터 제한
//			boolean flag=scores[i]>=0 && scores[i]<=100;
			if (!(flag=scores[i]>=0 && scores[i]<=100)) {
				//다시 넣기
				i--;//인덱스 조정 다시 넣기
			}
//			System.out.println(flag);
//			sum=sum+scores[i];//누적
			
			
		}
		
		
		avg=sum/scores.length;
		
		System.out.println("합계는 "+sum);
		System.out.println("평균은 "+avg);
		System.out.println("인원수는 "+scores.length);
	}

}

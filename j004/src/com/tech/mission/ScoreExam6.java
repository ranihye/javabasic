package com.tech.mission;

import java.util.Scanner;

public class ScoreExam6 {
	public static void main(String[] args) {

		int[] scores=new int[5];
		Scanner scores1 = new Scanner(System.in);

		int sum=0;
		float avg=0.0f;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1)+"번 점수 입력:");
			scores[i]=scores1.nextInt();

			if (!(scores[i]>=0 && scores[i]<=100)) {
				//다시 넣기
				i--;//인덱스 조정 다시 넣기
				continue;
			}
//			System.out.println(flag);
			sum=sum+scores[i];//누적
			
			
		}
		
		
		avg=sum/(float)scores.length;
		
		System.out.println("합계는 "+sum);
		System.out.println("평균은 "+avg);
		System.out.println("인원수는 "+scores.length);
	}

}

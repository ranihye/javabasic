package com.tech.mission;

import java.util.Scanner;

public class ScoreExam2 {
	public static void main(String[] args) {
		//배열사이즈는 5
		//점수를 받아 배열에 저장
		//평균 합계 인원 출력
		//메일 베목 : 배열 성적 처리
		//배열로 총점매기기
		//입력제한 (0~100)
		int[] scores=new int[5];
		int sum=0;
		System.out.println("점수를 입력하세요.");
		
		Scanner num = new Scanner(System.in);
		
	
		for (int j = 0; j < scores.length; j++) {
			scores[j]=num.nextInt();
			if (scores[j]<0 || scores[j]>100) {
				System.out.println("다시 입력하세요.");
				j--;
				continue;
			}
			
			sum=sum+scores[j];
		}
		float avg=sum/(float)scores.length;
		
		System.out.println("합계는 "+sum);
		System.out.println("평균은 "+avg);
		System.out.println("인원수는 "+scores.length);
	}

}

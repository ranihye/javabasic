package com.tech.mission;

import java.util.Scanner;

public class ScoreExam6 {
	public static void main(String[] args) {

		int[] scores=new int[5];
		Scanner scores1 = new Scanner(System.in);

		int sum=0;
		float avg=0.0f;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1)+"�� ���� �Է�:");
			scores[i]=scores1.nextInt();

			if (!(scores[i]>=0 && scores[i]<=100)) {
				//�ٽ� �ֱ�
				i--;//�ε��� ���� �ٽ� �ֱ�
				continue;
			}
//			System.out.println(flag);
			sum=sum+scores[i];//����
			
			
		}
		
		
		avg=sum/(float)scores.length;
		
		System.out.println("�հ�� "+sum);
		System.out.println("����� "+avg);
		System.out.println("�ο����� "+scores.length);
	}

}

package com.tech.mission;

import java.util.Scanner;

public class ScoreExam4 {
	public static void main(String[] args) {
		//�迭������� 5
		//������ �޾� �迭�� ����
		//��� �հ� �ο� ���
		//���� ���� : �迭 ���� ó��
		//�迭�� �����ű��
		//�Է����� (0~100)
		int[] scores=new int[5];
		Scanner scores1 = new Scanner(System.in);

		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1)+"�� ���� �Է�:");
			scores[i]=scores1.nextInt();
			
		}
		
		int sum=0;
		
		for (int i = 0; i < scores.length; i++) {
			sum=sum+scores[i];
			
			
		}
		
		
		
//		int sum=a+b+c+d+e;
		float avg=1.0f;
//		
		avg=sum/scores.length;
//		
		System.out.println("�հ�� "+sum);
		System.out.println("����� "+avg);
		System.out.println("�ο����� "+scores.length);
	}

}

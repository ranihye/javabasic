package com.tech.mission;

import java.util.Scanner;

public class ScoreExam5 {
	public static void main(String[] args) {
		//�迭������� 5
		//������ �޾� �迭�� ����
		//��� �հ� �ο� ���
		//���� ���� : �迭 ���� ó��
		//�迭�� �����ű��
		//�Է����� (0~100)
		int[] scores=new int[5];
		Scanner scores1 = new Scanner(System.in);

		int sum=0;
		float avg=1.0f;
		boolean flag;
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1)+"�� ���� �Է�:");
			scores[i]=scores1.nextInt();
			
//			�Է� ������ ����
//			boolean flag=scores[i]>=0 && scores[i]<=100;
			if (!(flag=scores[i]>=0 && scores[i]<=100)) {
				//�ٽ� �ֱ�
				i--;//�ε��� ���� �ٽ� �ֱ�
			}
//			System.out.println(flag);
//			sum=sum+scores[i];//����
			
			
		}
		
		
		avg=sum/scores.length;
		
		System.out.println("�հ�� "+sum);
		System.out.println("����� "+avg);
		System.out.println("�ο����� "+scores.length);
	}

}

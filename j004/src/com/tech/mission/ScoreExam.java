package com.tech.mission;

import java.util.Scanner;

public class ScoreExam {
	public static void main(String[] args) {
		//�迭������� 5
		//������ �޾� �迭�� ����
		//��� �հ� �ο� ���
		//���� ���� : �迭 ���� ó��
		//�迭�� �����ű��
		//�Է����� (0~100)
		int[] scores=new int[5];
		
		System.out.println("������ �Է��ϼ���.");
		
		Scanner num = new Scanner(System.in);

		for (int j = 0; j < scores.length; j++) {
			scores[j]=num.nextInt();
			if (scores[j]<0 || scores[j]>100) {
				System.out.println("�ٽ� �Է��ϼ���.");
				j--;
				continue;
			}
			
		}
		
		int sum=0;
		
		for (int i = 0; i < scores.length; i++) {
			sum=sum+scores[i];
		}
		
		float avg=sum/(float)scores.length;
		
		System.out.println("�հ�� "+sum);
		System.out.println("����� "+avg);
		System.out.println("�ο����� "+scores.length);
	}

}
package com.tech.w03;

import java.util.Scanner;

public class ArrayNameHeightExam5 {
	public static void main(String[] args) {
		//������ ����Ģ
		
		//�ʼ� ����
		//	-�ϳ� �̻��� ����
		//	-*ù��° ���ڴ� ���ڰ�, _ , $ ����
		//	-���̿� ���Ѿ���
		//	-*�ڹ��� Ű���� ���Ұ� ��)int,public
		
		//���� ����
		//	-ù ���ڸ� �ҹ��� ���
		//	-�ǹ̸� ��� ���
		//��� �ռ���
		//	student score �δܾ ����ϰ�, �ռ����϶� ǥ���ϴ¹�
		//	studentScore	camel type -�ַ� ����ϴ� Ÿ��
		//	student_Score	snake type
		
		
		
		
//		�迭1 names�� �̸� 5���� �̸� �Է��ϰ�
//		�迭2 heights ���� �̸��� Ű�� �Է¹޾�
//		�迭1�� �̸��� �ش��ϴ� Ű�� ����Ͻÿ�
//		���� ��Ż, ������� ���
		
		
		Scanner n=new Scanner(System.in);
		System.out.println("�ο����� �Է�");
		int cntPerson=n.nextInt();//camel type�� ��
		
		String[] names= new String[cntPerson];	
		
		int[] heights=new int[names.length];
		
		int total=0;
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("�̸��� �Է��Ͻÿ�");
			names[i]=n.next();
			System.out.println("Ű�� �Է��Ͻÿ�");
			heights[i]=n.nextInt();
			total+=heights[i];
		}	
			
		
		System.out.println("Ű�� �հ�:"+total);
		System.out.println("Ű�� ���:"+total/(float)heights.length);
}
}
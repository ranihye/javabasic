package com.tech.w03;

import java.util.Scanner;

public class ArrayNameHeightExam {
	public static void main(String[] args) {
//		�迭1 names�� �̸� 5���� �̸� �Է��ϰ�
//		�迭2 heights ���� �̸��� Ű�� �Է¹޾�
//		�迭1�� �̸��� �ش��ϴ� Ű�� ����Ͻÿ�
//		���� ��Ż, ������� ���
		String[] names= {"tom1","tom2","tom3","tom4","tom5"};//�̸� ����
		int[] heights=new int[5];//�迭 ����
		
		Scanner n=new Scanner(System.in);//�Է� �ްڴ�
		
		int total=0;
		
		for (int i = 0; i < heights.length; i++) {
			System.out.println("Ű�� �Է��Ͻÿ�");
			heights[i]=n.nextInt();
			total+=heights[i];//����
		}
		
		
		for (int i = 0; i < heights.length; i++) {
			System.out.println(names[i]+"�� Ű��:"+heights[i]);
		}
		
		System.out.println("Ű�� �հ�:"+total);
		System.out.println("Ű�� �հ�:"+total/(float)heights.length);
	
	}	

}

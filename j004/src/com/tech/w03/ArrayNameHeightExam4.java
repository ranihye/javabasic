package com.tech.w03;

import java.util.Scanner;

public class ArrayNameHeightExam4 {
	public static void main(String[] args) {
//		�迭1 names�� �̸� 5���� �̸� �Է��ϰ�
//		�迭2 heights ���� �̸��� Ű�� �Է¹޾�
//		�迭1�� �̸��� �ش��ϴ� Ű�� ����Ͻÿ�
//		���� ��Ż, ������� ���
		
		
		Scanner n=new Scanner(System.in);
		
		String[] names= new String[5];	
		int[] heights=new int[names.length];
		
		int total=0;
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("�̸��� �Է��Ͻÿ�");
			names[i]=n.next();
			System.out.println("Ű�� �Է��Ͻÿ�");
			heights[i]=n.nextInt();
			}
		
		
//		int[] heights=new int[5];
//		
//		
//		int total=0;
//		
//		for (int i = 0; i < heights.length; i++) {
//			total+=heights[i];//����
//		}
//		
//		
//		for (int i = 0; i < heights.length; i++) {
//			System.out.println(names[i]+"�� Ű��:"+heights[i]);
//		}
//		
//		System.out.println("Ű�� �հ�:"+total);
//		System.out.println("Ű�� �հ�:"+total/(float)heights.length);
//	
	}	

}

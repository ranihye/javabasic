package com.tect.a02;

public class BitLogicaExam {
	public static void main(String[] args) {
//		��Ʈ������
		System.out.println(45&25);//��Ʈ���� &(and)
		System.out.println(Integer.toBinaryString(45));
		System.out.println("  "+Integer.toBinaryString(25));
		System.out.println();
		
		System.out.println(45|25);//��Ʈ���� |(or)
		System.out.println(Integer.toBinaryString(45));
		System.out.println("  "+Integer.toBinaryString(25));
		System.out.println();
		
		System.out.println(45^25);//��Ʈ���� ^(��Ÿ��or) ���� �ٸ����� ��
		System.out.println(Integer.toBinaryString(45));
		System.out.println("  "+Integer.toBinaryString(25));
	}
}
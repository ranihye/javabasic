package com.tect.a02;

public class CharExam {
	public static void main(String[] args) {
		char c1='A'+1;//A�� �ƽ�Ű�ڵ�� ���� 65+1=66=�ƽ�Ű�ڵ� B
		System.out.println('A'+1);//char<int�̹Ƿ� ���ڷ� ��µ�
		System.out.println(c1);//=char�̱⶧���� ���� B�� ���
		System.out.println((int)c1);//=int�̱⶧���� ���ڷ� 66 ���
		c1='A';//c�� A��� ����
		System.out.println(c1);//����� ���
		char c2=c1;//c�� c1��� ����
		System.out.println(c2);//����� ���
	}
}

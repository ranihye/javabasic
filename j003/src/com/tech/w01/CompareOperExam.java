package com.tech.w01;

public class CompareOperExam {
	public static void main(String[] args) {
		int num1=10;
		int num2=10;
//		 num�� ������ �ƴ��� �� true(��)���� false(����)���� �Ǵ�
		boolean result1=(num1==num2);//num1�� num2�� ������?
		boolean result2=(num1!=num2);//num1�� num2�� �ٸ���?
		boolean result3=(num1<=num2);//num1�� num2���� �۰ų� ������?
		
		
		System.out.println(result1);		
//		���� ������ �� true(��)���� ��� ���
		System.out.println(result2);
//		�ٸ��� ������ false(����)���� ��� ���
		System.out.println(result3);
//		���� ������ �� true(��)���� ��� ���

		char char1='A';
		char char2='B';
		boolean result4=char1<char2;
		System.out.println(result4);
		
	}
}

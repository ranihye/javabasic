package com.tech.w07;

public class WhileExam2 {
	public static void main(String[] args) {
//		1~10�հ�
		int i=1;//i�� ���� 1�̴�.
		int sum=0;//sum�� ���� 0�̴�.
		//������ �������� ������ ������ �ȵȴ�. 
		while (i<=10) {//i�� 10���� �۰ų� ���������� �ݺ��Ѵ�.
			System.out.println(i);//i ���
			sum=sum+i;//sum�� sum+i��.
			i++;//
		}
		System.out.println("sum:"+sum);//sum ���
	}

}

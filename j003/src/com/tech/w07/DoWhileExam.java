package com.tech.w07;

public class DoWhileExam {
	public static void main(String[] args) {
//		�ּ� �ѹ��� �� �����ϰ� ������
		int i=1;
		int sum=0;
		//������ �������� �ʾƵ� �� �ѹ��� ����ȴ�. 
		do {
			System.out.println(i);
			sum=sum+i;
			i++;
		} while (i<=10);{
		System.out.println("sum:"+sum);
	}

}
}
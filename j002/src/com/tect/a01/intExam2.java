package com.tect.a01;

public class intExam2 {
	public static void main(String[] args) {
//		����������
		int a=10;
		int b=5;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		a=a+a;
		System.out.println("a:"+a); //=������� a:20
//		a=a+(++a);	//++�� 1�� �������Ѷ�=(10+1)+10(a)=21 ������� a:21
//		System.out.println("a:"+a);
//		a=a+(a++)	;//++�� 1�� �������Ѷ� ������� a:20
//		System.out.println("a:"+a);
		
		b=b++;
		System.out.println("b:"+b);
		b=b++;
		System.out.println("b:"+b);
		System.out.println("b2:"+(b++));//����� ������ ������� 6
		System.out.println("b:"+b);//������ ������ ������� ������� 7
//		Ÿ���� ������ ���� ���� ����. 
//		����� Ÿ���� �����ڰ� ������ ����.
	}
	
}

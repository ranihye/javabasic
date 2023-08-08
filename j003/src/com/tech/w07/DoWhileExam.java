package com.tech.w07;

public class DoWhileExam {
	public static void main(String[] args) {
//		최소 한번은 꼭 실행하고 싶을때
		int i=1;
		int sum=0;
		//조건이 만족하지 않아도 꼭 한번은 실행된다. 
		do {
			System.out.println(i);
			sum=sum+i;
			i++;
		} while (i<=10);{
		System.out.println("sum:"+sum);
	}

}
}
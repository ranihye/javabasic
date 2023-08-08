package com.tech.w01;

public class MultiplusExam {
	public static void main(String[] args) {
		int var1=1;
		int var2=2;
		int var3=3;
				
		int result1=var1+var2*var3;//연산자 우선 순위(*가 먼저)
		System.out.println(result1);
		
		int result2=(var1+var2)*var3;//연산자 우선 순위(()가 먼저)
		System.out.println(result2);
		
	}
}

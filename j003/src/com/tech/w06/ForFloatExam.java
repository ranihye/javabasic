package com.tech.w06;

public class ForFloatExam {
	public static void main(String[] args) {
//		for (float x = 0.1f; x < 1.0f; x=x+0.1f) {
//			System.out.println("print:"+x);
//		}
//		Printf 
		
		for (float x = 0.1f; x < 1.0f; x=x+0.1f) {
			System.out.printf("print:%.2f\n",x);//printf는 float를 정확하게 출력하고 함
			//%.2f는 소수점 2번째 자리까지만 표시
		}
		
//		Printf 2
			
		for (float x = 0.1f; x < 1.0f; x=x+0.1f) {
			System.out.printf("print:%5.2f\n",x);//printf는 float를 정확하게 출력하고 함
			//%.2f는 소수점 2번째 자리까지만 표시
		}
		
		int num=100;
		float score=100.0f;
		String str="구디역";
		char ch='굳';
		System.out.printf("num:%d\n",num);
		System.out.printf("c:%c\n",ch);
		System.out.printf("c:%s\n",str);
		System.out.printf("구트는 %s에 있는 %d%% %c %.1f%%\n",str,num,ch,score);
		
	}
}



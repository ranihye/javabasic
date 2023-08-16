package com.tech.w01;

public class ArryExam4 {
	public static void main(String[] args) {
//		int[] arr=new int[5];
//		배열 선언의 다른방법
		int[] arr = { 10, 20, 30, 40, 53 };// 대입값
		
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		
		float avg=sum/(float)arr.length;//실수(소수점)으로 나오게 하려면 둘중 하나를 강제 형변환 해준다.
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("인원수 : "+arr.length);
		
	
	}
}

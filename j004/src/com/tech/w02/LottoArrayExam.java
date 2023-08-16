package com.tech.w02;

import java.util.Arrays;

public class LottoArrayExam {
	public static void main(String[] args) {
		//로또 
		//1~45 추출
		
		int[] arr=new int[6];

		for (int i = 0; i < arr.length; i++) {
			int num=(int)(Math.random()*45)+1;
			arr[i]=num;
			System.out.println("arr:"+i+">>"+arr[i]);
			//중복회피
			for (int j = 0; j < i; j++) {
				if (arr[j]==num) {//이미 입력된 값과 new값 같은 값이 있는가?
					i--;//제자리로 돌아가기
				}
				
			}
			
		}
		
		//정렬 전
		System.out.println(Arrays.toString(arr));//배열을 문자로 출력한다.
		//정렬 후
		//오름차순 1,2,3,4,a,b,c,d,가,나,다,라 정렬 내림차순은 반대
		Arrays.sort(arr);//정렬
		System.out.println(Arrays.toString(arr));
		
		
	}

}

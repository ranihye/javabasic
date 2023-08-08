package com.tech.w02;

public class missoin2 {
	public static void main(String[] args) {
		
//		삼각형의 면적 구하기
//		사격형의 면적 구하기
//		가로 100 width
//		세로 50 height
//		변수명 
//		면적 recsquare, trisqeare
//		타입 sytpe=4,3

		int stype=3;
		int width=5;
		int height=5;
		float quadrangle=width*height;
		float triangle=width*height/2.0f;
		if(stype==4) {
			System.out.println("사각형:"+triangle);
		}else if(stype==3) {
			System.out.println("삼각형:"+quadrangle);
		}
			
	}

}
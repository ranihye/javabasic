package com.tech.w02;


public class missoin4 {
	public static void main(String[] args) {

		int stype=4;//은 3이다.
		int width=5;
		int height=5;
		String typeStr=" ";//초기화값, 값이 안맞을때 나옴
		float recsquare=0;//초기화값, 값이 안맞을때 나옴
		if(stype==4) {//만약 타입이 4와 같을때
			recsquare=width*height;//recsquare값은 width*height이고,
			typeStr="사각형";//문자는 사각형으로 지정
		}else if(stype==3){//만약 타입이 3와 같을때
			recsquare=width*height/2;//recsquare값은 width*height/2이고,
			typeStr="삼각형";//문자는 사각형으로 지정
		}else {	
			
		}
			System.out.println(typeStr+"의 면적은 : "+recsquare);
	}

}

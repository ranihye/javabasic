package com.tech.w03;

import java.util.Calendar;

public class IfGoodmorning {
	public static void main(String[] args) {
//		객체생성
		
//		Date date=new Date();
//		
//		int currHour=date.getHours();//이 메소드를 사용하지 마세요.
//		
//		System.out.println(currHour);
//		if 12보다 작으면 Goodmorning 아니면 GoodEvening
//		
//		
//		if (currHour<12) {
//			System.out.println("Goodmorning");
//		}else {
//			System.out.println("GoodEvening");
//		}

		Calendar carCalendar=Calendar.getInstance();
		int hour=carCalendar.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
				
			if(hour>12) {
				System.out.println("Goodmorning");
				}else {
					System.out.println("GoodEvening");
				}
	}
}

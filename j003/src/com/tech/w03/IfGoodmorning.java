package com.tech.w03;

import java.util.Calendar;

public class IfGoodmorning {
	public static void main(String[] args) {
//		��ü����
		
//		Date date=new Date();
//		
//		int currHour=date.getHours();//�� �޼ҵ带 ������� ������.
//		
//		System.out.println(currHour);
//		if 12���� ������ Goodmorning �ƴϸ� GoodEvening
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

package com.tech.w04;

public class SwitchExam4 {
	public static void main(String[] args) {
		int num=(int)(Math.random()*12);
			System.out.println(num+"월");
		
		switch (num) {
		
		case 3:	//3,4,5월은 공통은 공란으로 두고 맨아래 결과값 출력
		case 4:	
		case 5:	System.out.println("봄입니다.");	break;
		case 6:	
		case 7:	
		case 8:	System.out.println("여름입니다.");	break;
		case 9:	
		case 10:	
		case 11:	System.out.println("가을입니다.");	break;
		case 1:	
		case 2:	
		case 12:	System.out.println("겨울입니다.");	break;

		default:
			break;
		}
		

	}

}

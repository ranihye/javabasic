package com.tech.w02;

import java.util.Scanner;

public class YesNo {
	public static void main(String[] args) {
		Scanner anr=new Scanner(System.in);
		
		

		String iduser="gpwi09";
		String pwuser="123456789";
		
		System.out.print("ID: ");
		String id=anr.next();
		
		System.out.print("PASSWORD: ");
		String pw=anr.next();
		
		for (int i = 0; i < 6; i++) {
			
			if (id!=iduser && pw!=pwuser) {
				System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �Է��ϼ���!!");
				
				System.out.print("ID: ");
				id=anr.next();
				
				System.out.print("PASSWORD: ");
				pw=anr.next();
			}
			else
			{
				System.out.println("�α��εǾ����ϴ�.");
				break;
			}
			
		}
//		if (id!=iduser && pw!=pwuser) {
//			
//			for (int i = 0; i < 6; i++) {
//				
//			}
//			System.out.println("Ʋ�Ƚ��ϴ�.");	
//			
//			
//		}
		
	}

}

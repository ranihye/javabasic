package com.tech.w02;

public class ifElseExam2 {
	public static void main(String[] args) {
//		point�� �ޱ� =  800;
//		
//		Point�� 900�̻� leve11
//		800�̻� leve12
//		700�̻� leve13
//		�������� leve0	
//		�̻�>= ����<= �̸�< �ʰ�> 
		
		int point=800;
		if(point>=900) {
			System.out.println("leve11");
		}else if(point>=800) {
			System.out.println("leve12");
		}else if(point>=700) {
			System.out.println("leve11");
		}else {
			System.out.println("leve0");
		}	
	}
}
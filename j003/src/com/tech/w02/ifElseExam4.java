package com.tech.w02;

public class ifElseExam4 {
	public static void main(String[] args) {
//		point�� �ޱ� =  800;
//		
//		Point�� 900�̻� leve11
//		800�̻� leve12
//		700�̻� leve13
//		�������� leve0
		
//		�̻�>= ����<= �̸�< �ʰ�> 
		
		
		int point=800;
		String pont="";
		if(point>=900) {
			pont="leve11";
		}else if(point>=800) {
			pont="leve12";
		}else if(point>=700) {
			pont="leve13";
		}else {
		}	
		System.out.println(pont);
	}
}
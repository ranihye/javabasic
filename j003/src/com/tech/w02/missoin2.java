package com.tech.w02;

public class missoin2 {
	public static void main(String[] args) {
		
//		�ﰢ���� ���� ���ϱ�
//		������� ���� ���ϱ�
//		���� 100 width
//		���� 50 height
//		������ 
//		���� recsquare, trisqeare
//		Ÿ�� sytpe=4,3

		int stype=3;
		int width=5;
		int height=5;
		float quadrangle=width*height;
		float triangle=width*height/2.0f;
		if(stype==4) {
			System.out.println("�簢��:"+triangle);
		}else if(stype==3) {
			System.out.println("�ﰢ��:"+quadrangle);
		}
			
	}

}
package com.tech.w02;


public class missoin4 {
	public static void main(String[] args) {

		int stype=4;//�� 3�̴�.
		int width=5;
		int height=5;
		String typeStr=" ";//�ʱ�ȭ��, ���� �ȸ����� ����
		float recsquare=0;//�ʱ�ȭ��, ���� �ȸ����� ����
		if(stype==4) {//���� Ÿ���� 4�� ������
			recsquare=width*height;//recsquare���� width*height�̰�,
			typeStr="�簢��";//���ڴ� �簢������ ����
		}else if(stype==3){//���� Ÿ���� 3�� ������
			recsquare=width*height/2;//recsquare���� width*height/2�̰�,
			typeStr="�ﰢ��";//���ڴ� �簢������ ����
		}else {	
			
		}
			System.out.println(typeStr+"�� ������ : "+recsquare);
	}

}

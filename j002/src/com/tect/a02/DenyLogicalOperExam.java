package com.tect.a02;

public class DenyLogicalOperExam {
	public static void main(String[] args) {
		//boolean, not �Լ� ����
		boolean play1=false;
		boolean play2=false;
		System.out.println(play1);

		//		���Լ� not
		
		play1=!play1;//play�� true !�� �ݴ�� ǥ��
		System.out.println(play1);
		
		boolean result1=play1 || play2;//||�� or ~�̰ų�
		System.out.println(result1);
		boolean result2=play1 && play2;//&&�� and  �׸���
		System.out.println(result2);
		
		play1=!(!play1);//play�� true !�� �ݴ�� ǥ�� ���Լ��� �ɾ���
		System.out.println(play1);
		
	}	

}

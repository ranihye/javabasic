package com.tech.w02;

public class MinExam {
	public static void main(String[] args) {
		//�迭 ���� �ּҰ� ���ϱ�
		int[] arr= {80,40,70,20,30};
		//�ּҰ� �˻�
		int min=101;//�迭 ���� �ְ� ������ 100�̶� �Ҷ�
		for (int  i = 0;  i < arr.length; i++) {
			if (min>arr[i]) 
				min=arr[i];//������ �ٲ��ֱ�
		}
		System.out.println("�ּҰ�:"+min);
		}
	}



package com.tech.w02;

public class TwoDemenArray4 {
	public static void main(String[] args) {
		//������ �迭 ����
		//5,4 arr�� ����
//		int[][] arr=new int[5][4];
		int[][] arr={
				{1,2,3,4,5},
				{11,12,13,14},
				{21,22,23,24},
				{31,32,33,34},
				{41,42,43,44}
		};

	
		//�� ����� ���
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i]);
				
			}
		}
		
	}

}

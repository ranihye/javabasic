package com.tech.w02;

public class TwoDemenArray {
	public static void main(String[] args) {
		//������ �迭 ����  ��(����/��/Row) ��(����/ĭ/Column) (��������/Racord)
		int[] [] arr=new int[4] [3];//����� ����[]
		//������ �迭�� ����
		System.out.println(arr.length);//���� ������ ������ �迭������ length
		System.out.println(arr[0].length);//������ �迭�� ����
		//������ ����
		arr[0][0]=10;arr[0][1]=20;arr[0][2]=30;
		arr[1][0]=40;arr[1][1]=50;arr[1][2]=60;
		arr[2][0]=70;arr[2][1]=80;arr[2][2]=90;
		arr[3][0]=100;arr[3][1]=110;arr[3][2]=120;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
		
	}

}

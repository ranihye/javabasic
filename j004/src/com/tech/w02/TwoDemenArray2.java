package com.tech.w02;

import java.util.Arrays;

public class TwoDemenArray2 {
	public static void main(String[] args) {
		//������ �迭 ����
		//5,4 arr�� ����
		int[][] arr=new int[5][4];
		//���� 1�� ������ ���� �迭�� ���̰�
		//for���� Ȱ��
		int cnt=1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=cnt;
				cnt++;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();

		}
		//�� ����� ���
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}

}

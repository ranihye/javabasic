package com.tech.w02;

import java.util.Arrays;

public class SortExam2 {
	public static void main(String[] args) {
		// ���� ����
		int[] arr = { 20, 10, 5, 30, 2 };
		// ��Ʈ�� ���
		System.out.println(Arrays.toString(arr));

		// �����Ǵ� �Լ��� �̿��ϴ� ���
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("===================");

		int[] arr2 = { 30, 10, 50, 35, 2 };
		System.out.println("������ : " + Arrays.toString(arr2));
		
		// ���� �˰��� ".toString()"�� �޼ҵ�� �Ʒ� �˰����� �����ߴ�. 
		int tmp;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length - 1; j++) {
				if (arr2[j] < arr2[j + 1]) {//����� ��������, �ε�ȣ�� �ٲ��ָ� ������������ �ٲ��. 
					// ������ ��ȯ
					tmp = arr2[j + 1];
					arr2[j + 1] = arr2[j];
					arr2[j] = tmp;

				}

			}
			System.out.println((i+1)+"������"+Arrays.toString(arr2));

		}
		System.out.println("������ : " + Arrays.toString(arr2));
	}

}

package com.tech.w03;

import java.util.Scanner;

public class Arraymission {
	public static void main(String[] args) {
//		10���� ��Ҹ� ������ �� �ִ� �迭 ����
//		�迭�� ������ �Է� �޴´� 50~100������
//		�հ�,���,�ִ�����,�ּ����� ���
//		�迭 ������ �Է¹ޱ�
//		for�� Ȱ�� �հ�,���,�ִ�����,�ּ����� ���ϱ�
		
		Scanner num = new Scanner(System.in);
		
		int[] arr = new int[10];

		int total = 0;
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("������ �Է��ϼ���");
			arr[i] = num.nextInt();
		
			if (arr[i] < 50 || arr[i] > 100) {
				System.out.println("�ٽ� �Է��ϼ���.");
				i--;
			}

			if (min < arr[i])
				min = arr[i];// ������ �ٲ��ֱ�
			if (max > arr[i])
				max = arr[i];

			total += arr[i];
		}

		System.out.println("������ �հ�� " + total);
		System.out.println("������ ����� " + total / (float) arr.length);
		System.out.println("�ּ� ������ " + min);
		System.out.println("�ִ� ������ " + max);

	}

}

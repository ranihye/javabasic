package com.tech.w06;

public class ForExam4 {
	public static void main(String[] args) {
		// For���� �ݺ������� �հ� ���ϱ�
		// ¦���� �հ� even, Ȧ���� �հ� odd
		int even = 0, odd = 0;
		for (int i = 1; i < 10000; i++) {
			if (i % 2 == 0) {// ¦��
				even += i;// �ѹ����϶� �߰�ȣ ��������
			} else
				odd += i;

		}
		System.out.println("¦�� : " + even);
		System.out.println("Ȧ�� : " + odd);

		even = 0;
		odd = 0;
		for (int i = 0; i < 10; i = i + 2) {
			System.out.println(i);
			even += i;
		}
		System.out.println(even);
	}

}

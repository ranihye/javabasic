package com.tech.w06;

public class ForExam2 {
	public static void main(String[] args) {
//		
//		For(�ʱⰪ;���ǽ�;������){
//			����
//		}
//		������� : �ʱⰪ->���ǽ�->����->������->[���ǽ�->����->������]���ǿ� ���������� ������
		// ���� for��
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + "�ݺ�");
		}
		System.out.println("-------------");
		// ���� for��
		for (int i = 0; i <= 10; i = i + 2) {// 2�� �þ
			System.out.println(i + "�ݺ�");
		}
		System.out.println("-------------");
		// ���� for��
		for (int i = 10; i > 0; i--) {
			System.out.println(i + "�ݺ�");
		}
	}
}

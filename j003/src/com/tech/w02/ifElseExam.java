package com.tech.w02;

public class ifElseExam {
	public static void main(String[] args) {
		int score=50;//score�� 50�̴�.
		if (score>=90) {//if,���࿡(score�� 90���� ũ�ų� ������)
			System.out.println("90�� ����");//��°�
			}else if(score>=80){
			System.out.println("80���� ����");
			}else if(score>=70) {
			System.out.println("70���� ����");
			}else if(score>=60) {
			System.out.println("60���� ����");
			}else if(score>=50) {
			System.out.println("50���� ����");
			}else {//�� �����̿��� ����
			System.out.println("60�� �̸� ����");
			}
	}
}
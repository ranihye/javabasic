package com.tech.w03;

public class IfNestedExam {
	//��øif(if���ȿ� if�� ����)
	public static void main(String[] args) {
		int score=(int) (Math.random()*50)+50;//int�� �����ε� random�� �Ǽ��̴� 0*50�� �Ǿ� ��� 0�� ����. �� ��ȣ ����߉�.
//		System.out.println(score);
	//���� �ű�� A+=95 A=90 B+=85 B=80...
//		int score1=90;
		String grade="";
		System.out.println("������ "+score+"��,");
		if (score>=90) {
			if (score>95) {
				grade="A+";
			}
			else {
				grade="A";	
			}
			
		}else if (score>=80) {
			if (score>85) {
				grade="B+";
			}
			else {
				grade="B";
				
			}
			
		}else if (score>=70) {
			if (score>75) {
				grade="C+";
			}
			else {
				grade="C";
				
			}
		}else if (score>=60) {
			if (score>60) {
				grade="D+";
			}
			else {
				grade="D";
				
			}
		}else {
			grade="F";
		}
		System.out.println("����� "+grade+" �Դϴ�.");
		
	}
}
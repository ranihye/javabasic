package com.tech.w03;

public class ifRanbomExam {
	public static void main(String[] args) {
//		����
//		double score=Math.random();//���� ���� 0.0~0.999999999999...���� ���´�.
//		System.out.println(score);
		
		
//		�̼� ���� 50�̻��� ��µǵ���!
//		����:���� ������ ������������ 
		
		double score=Math.random();
//		score=Math.random()+50; //50�������� ���� ���� ����
//		score=(Math.random()*50)+50; //���� ���彺������ ����
//		score=(int)((Math.random()*50)+50); //�Ҽ��� �ϳ��� ����
		
//		System.out.println(score);
		
//		�����ű��
//		90�� �̻� A 80���̻� 
		score=(Math.random()*50)+50;
		System.out.println((int)score);
		String grade="";
		if (score>=90) {
			grade="A���";	
		}else if (score>=80) {
			grade="B���";	
		}else if (score>=70) {
			grade="C���";	
		}else if (score>=60) {
			grade="D���";
		}else {//������ �޾�����.
			grade="F���";
		}
		System.out.println("���:"+grade);
		
//		+ ¦Ȧ�� ����
//		%�� ������ ������
		if ((int)score%2==1) {//score�� 2�� ���� �������� 1�ΰ�?
			System.out.println("Ȧ����");
		}else {
			System.out.println("¦����");
			
		}
		
	}

}

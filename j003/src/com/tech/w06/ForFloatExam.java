package com.tech.w06;

public class ForFloatExam {
	public static void main(String[] args) {
//		for (float x = 0.1f; x < 1.0f; x=x+0.1f) {
//			System.out.println("print:"+x);
//		}
//		Printf 
		
		for (float x = 0.1f; x < 1.0f; x=x+0.1f) {
			System.out.printf("print:%.2f\n",x);//printf�� float�� ��Ȯ�ϰ� ����ϰ� ��
			//%.2f�� �Ҽ��� 2��° �ڸ������� ǥ��
		}
		
//		Printf 2
			
		for (float x = 0.1f; x < 1.0f; x=x+0.1f) {
			System.out.printf("print:%5.2f\n",x);//printf�� float�� ��Ȯ�ϰ� ����ϰ� ��
			//%.2f�� �Ҽ��� 2��° �ڸ������� ǥ��
		}
		
		int num=100;
		float score=100.0f;
		String str="����";
		char ch='��';
		System.out.printf("num:%d\n",num);
		System.out.printf("c:%c\n",ch);
		System.out.printf("c:%s\n",str);
		System.out.printf("��Ʈ�� %s�� �ִ� %d%% %c %.1f%%\n",str,num,ch,score);
		
	}
}



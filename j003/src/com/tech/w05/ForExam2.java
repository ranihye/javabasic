package com.tech.w05;

public class ForExam2 {
	public static void main(String[] args) {
//		
//		For(�ʱⰪ;���ǽ�;������){
//			����
//		}
//		������� : �ʱⰪ->���ǽ�->����->������->[���ǽ�->����->������]���ǿ� ���������� ������
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(i+"�ݺ�");
//			if (i==5) {
//				break;//�ݺ����� Ż��
//			}
//		}
		
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 3; j++) {
//				if(i==3) {
//					break;
//				}
//				System.out.println("i:"+i+" j:"+j);
//				
//				}
//			}
		
		gotolabe:
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 3; j++) {//���� for���� ������ �ɽ� �ٱ��� for���� �����.
				if(i==3) {
//					break;
					break gotolabe;
				}
				System.out.println("i:"+i+" j:"+j);
				}
			}
		}
	}



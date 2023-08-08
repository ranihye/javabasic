package com.tech.w07;

public class WhileBreakExam {
	public static void main(String[] args) {
		gotolabe1:
		//for 문속에 While 문장
		for (int i = 0; i < 5; i++) {
			int j=1;
			while (j<3) {
				j++;
				if (i==3) {
					//break;
					break gotolabe1;
				}
				System.out.println("i:"+i+", j:"+j);
			}
			
		}
	}

}

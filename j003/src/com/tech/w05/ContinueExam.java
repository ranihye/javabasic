package com.tech.w05;

public class ContinueExam {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i==5) {
				continue;//실행 생략되고 다시 for문으로 복귀, 반복은 계속 이후문장은 실행 안됌.
		}
			System.out.println("현재 i:"+i);
	}

}
}
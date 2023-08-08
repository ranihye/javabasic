package com.tect.a02;

public class BitLogicaExam {
	public static void main(String[] args) {
//		비트연산자
		System.out.println(45&25);//비트연산 &(and)
		System.out.println(Integer.toBinaryString(45));
		System.out.println("  "+Integer.toBinaryString(25));
		System.out.println();
		
		System.out.println(45|25);//비트연산 |(or)
		System.out.println(Integer.toBinaryString(45));
		System.out.println("  "+Integer.toBinaryString(25));
		System.out.println();
		
		System.out.println(45^25);//비트연산 ^(배타적or) 서로 다를때만 참
		System.out.println(Integer.toBinaryString(45));
		System.out.println("  "+Integer.toBinaryString(25));
	}
}
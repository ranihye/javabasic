package com.tech.w01;

import java.util.ArrayList;

public class TypeExam {
	public static void main(String[] args) {
		
		
		String str="ABC";//String Ÿ��
		Integer i=123;//Integer Ÿ��
		ArrayList<String> list=new ArrayList<String>();//ArrayList Ÿ��
		
		System.out.println("String : "+str.getClass().getName());
		System.out.println("String : "+i.getClass().getName());
		System.out.println("String : "+list.getClass().getName());
		
	}

}

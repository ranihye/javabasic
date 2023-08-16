package com.tech.w01;

import java.util.ArrayList;

public class TypeExam {
	public static void main(String[] args) {
		
		
		String str="ABC";//String 타입
		Integer i=123;//Integer 타입
		ArrayList<String> list=new ArrayList<String>();//ArrayList 타입
		
		System.out.println("String : "+str.getClass().getName());
		System.out.println("String : "+i.getClass().getName());
		System.out.println("String : "+list.getClass().getName());
		
	}

}

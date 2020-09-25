package com.kh.run;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본형으로 래퍼클래스 생성
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("입력:");
//		String data = sc.next();
//		int data = sc.nextInt();
//		int i = Integer.parseInt(data);
//		int a =10;
//		String s = String.valueOf(data);
//		
//		System.out.println(i+a+s);
//		
//		Boolean bool = new Boolean(true);    //boolean bool = true; 와 같지만 Boolean bool은 객체를 담은 레퍼런스 boolean bool은 변수
//		Byte b = new Byte((byte)1);
//		Character ch = new Character('A');
//		Short s = new Short((short)2);
//		Integer i = new Integer(4);
//		Long l = new Long(8L);
//		Float f = new Float(4.0f);
//		Double d = new Double(8.0);
//		
//		System.out.println(bool);
//		System.out.println(b);
//		System.out.println(ch);
//		System.out.println(s);
//		System.out.println(i);
//		System.out.println(l);
//		System.out.println(f);
//		System.out.println(d);
		
		new CalculatorImpl().start();
	}

}

package com.kh.run;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer();
		
		str.append("1234567890");
		str.append("1234567890");
		str.append("1234567890");
		str.append("12345678");
		System.out.println(str.length());
		System.out.println(str.capacity());
		
		
		StringBuffer test = new StringBuffer();
		test.append("HelloWorld");
		
		//���ڿ� ����
		test.insert(5, " sh ");
		System.out.println(test);
		
		//���ڿ� ��ü
		test.replace(5, 9, " kh ");
		System.out.println(test);
		
		//���ڿ� ����
		test.reverse();
		System.out.println(test);
		
		//���ڿ� ����
		test.delete(9, 14);
		System.out.println(test);
	}

}

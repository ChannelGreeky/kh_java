package com.kh.run;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public void start() {
		Properties prop = new Properties();

		try {
			prop.load(new FileReader("resources/version.Properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String name = prop.getProperty("user");
		String respons = prop.getProperty("respons");
		System.out.println("========="+name+"님 안녕하세요.=========");
		
		if (respons.equals("사원")) {
			System.out.println("1. 파일정리");
			System.out.println("2. 메신저");
		} else if (respons.equals("부장")) {
			System.out.println("1. 파일정리");
			System.out.println("2. 메신저");
			System.out.println("3. 직원관리");
			System.out.println("4. 주식하기");
		}
	}
}
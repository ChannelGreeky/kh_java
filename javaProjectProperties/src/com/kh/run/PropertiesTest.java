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
		System.out.println("========="+name+"�� �ȳ��ϼ���.=========");
		
		if (respons.equals("���")) {
			System.out.println("1. ��������");
			System.out.println("2. �޽���");
		} else if (respons.equals("����")) {
			System.out.println("1. ��������");
			System.out.println("2. �޽���");
			System.out.println("3. ��������");
			System.out.println("4. �ֽ��ϱ�");
		}
	}
}
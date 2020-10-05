package com.kh.run;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileTest2 {
	Scanner sc = new Scanner(System.in);
	
	public void charInputStream() {
		System.out.println("파일의 문자를 읽어오기 위한 스트림 코드");
		System.out.println("로드할 파일명 : ");
		String fileName = sc.next();
		
		sc.nextLine(); //버퍼 비우기
		
		BufferedReader bfr = null;
		
		try {
			bfr = new BufferedReader(new FileReader(fileName));
			String line = ""; //한 라인씩 읽어오기 위한 변수
			while(true) {
				line = bfr.readLine();
				if(line == null) break;
				System.out.println(line);	
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

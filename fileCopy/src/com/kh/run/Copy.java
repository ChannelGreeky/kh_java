package com.kh.run;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Copy {
	Scanner sc = new Scanner(System.in);
	
	public void byteInputOutputStream() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		System.out.print("읽어올 파일명(확장자 까지 입력하여 주십시오):");
		String fileName = sc.next();
		sc.nextLine();
		int index = fileName.lastIndexOf(".");
		String extension = fileName.substring(index + 1);  //확장자 추출

		System.out.print("복사할 파일명 : ");
		String copyFileName = sc.next();
		sc.nextLine(); // 버퍼 비우기
		copyFileName += "."+extension;
		
		File file = new File(fileName);

		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(copyFileName);

			do {
				int data = fis.read();
				if (data == -1) {
					break;
				} else {
					fos.write(data);
				}
			} while (true);
			System.out.println("복사완료. 폴더를 확인하세요.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("해당 파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

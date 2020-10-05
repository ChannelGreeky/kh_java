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
	
	public void byteInputStream() {
		FileInputStream fis = null;

		System.out.print("�о�� ���ϸ�(Ȯ���� ���� �Է��Ͽ� �ֽʽÿ�):");
		String fileName = sc.next();
		sc.nextLine();
		int index = fileName.lastIndexOf(".");
		String extension = fileName.substring(index + 1);  //Ȯ���� ����

		File file = new File(fileName);

		try {
			fis = new FileInputStream(file);

			do {
				int data = 0;
				if ((data = fis.read()) == -1) {
					break;
				} else {
					byteOutputStream(data, extension);
				}
			} while (true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("�ش� ������ ã�� �� �����ϴ�.");
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

	
	public void byteOutputStream(int data, String extension) {
		FileOutputStream fos = null;

		System.out.print("������ ���ϸ� : ");
		String fileName = sc.next();
		sc.nextLine(); // ���� ����
		
		fileName += "."+extension;
		
		try {
			fos = new FileOutputStream(fileName);
			
			fos.write(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		System.out.println("���� ���� �Ϸ�");
	}
}

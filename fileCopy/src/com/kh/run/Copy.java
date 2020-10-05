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
		
		System.out.print("�о�� ���ϸ�(Ȯ���� ���� �Է��Ͽ� �ֽʽÿ�):");
		String fileName = sc.next();
		sc.nextLine();
		int index = fileName.lastIndexOf(".");
		String extension = fileName.substring(index + 1);  //Ȯ���� ����

		System.out.print("������ ���ϸ� : ");
		String copyFileName = sc.next();
		sc.nextLine(); // ���� ����
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
			System.out.println("����Ϸ�. ������ Ȯ���ϼ���.");
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
}

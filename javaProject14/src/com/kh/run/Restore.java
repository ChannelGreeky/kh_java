package com.kh.run;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Restore {
	Scanner sc = new Scanner(System.in);

	public void restoreFile() {
		BufferedReader bfr = null;
		FileOutputStream fos = null;

		System.out.print("������ ���ϸ�(.txt����):");
		String fileName = sc.next();
		sc.nextLine();

		System.out.print("�����Ͽ� ������ ���ϸ� (.png): ");
		String restoreFileName = sc.next();
		sc.nextLine(); // ���� ����

		try {
			bfr = new BufferedReader(new FileReader(fileName));
			fos = new FileOutputStream(restoreFileName);
			String line = ""; //�� ���ξ� �о���� ���� ����
			while(true) {
				line = bfr.readLine();
				if(line == null) break;
				
				fos.write(line.getBytes());
			}
			System.out.println("�����Ϸ�. ������ Ȯ���ϼ���.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("�ش� ������ ã�� �� �����ϴ�.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bfr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void charInputStream() {
		System.out.println("������ ���ϸ� : ");
		String fileName = sc.next();
		sc.nextLine(); // ���� ����
		System.out.println("������ ���ϸ� : ");
		String restoreFileName = sc.next();
		sc.nextLine(); // ���� ����

		BufferedWriter bfw = null;
		BufferedReader bfr = null;

		try {
			bfw = new BufferedWriter(new FileWriter(restoreFileName));
			bfr = new BufferedReader(new FileReader(fileName));
			String line = ""; // �� ���ξ� �о���� ���� ����
			while (true) {
				line = bfr.readLine();
				if (line == null)
					break;
				bfw.write(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void byteInputOutputStream() {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		System.out.print("������ ���ϸ�(.txt����):");
		String fileName = sc.next();
		sc.nextLine();

		System.out.print("�����Ͽ� ������ ���ϸ� (.png): ");
		String restoreFileName = sc.next();
		sc.nextLine(); // ���� ����

		File file = new File(fileName);

		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(restoreFileName);

			do {
				int data = fis.read();
				if (data == -1) {
					break;
				} else {
					fos.write(data);
				}
			} while (true);
			System.out.println("�����Ϸ�. ������ Ȯ���ϼ���.");
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

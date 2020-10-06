package com.kh.run;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Restore {
	Scanner sc = new Scanner(System.in);

	// split���� �� ���
	public void restoreFile() {
		BufferedReader bfr = null;
		FileOutputStream fos = null;

		System.out.print("������ ���ϸ�(.txt����):");
		String fileName = sc.next();
		sc.nextLine();

		System.out.print("�����Ͽ� ������ ���ϸ� (.gif): ");
		String restoreFileName = sc.next();
		sc.nextLine(); // ���� ����

		try {
			bfr = new BufferedReader(new FileReader(fileName));
			fos = new FileOutputStream(restoreFileName);
			String line = ""; // �� ���ξ� �о���� ���� ����

			while (true) {
				line = bfr.readLine();
				if (line == null)
					break;
				String[] restoreStr = line.split(" ");
				for (int i = 0; i < restoreStr.length; i++) {
					// 16������ ���Ͽ� �ִ� ������ 10������ �ٲٴ� �۾�
					fos.write(Integer.parseInt(restoreStr[i], 16));
				}
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
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void restoreFileAnswer() {
		BufferedReader bfr = null;
		FileOutputStream fos = null;

		try {
			bfr = new BufferedReader(new FileReader("quiz.txt"));
			fos = new FileOutputStream("quiz2.gif");
			String line = ""; // �� ���ξ� �о���� ���� ����

			line = bfr.readLine();
			StringTokenizer st = new StringTokenizer(line, " ");
			
			while(st.hasMoreTokens()) {
				fos.write(Integer.parseInt(st.nextToken(), 16));
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
				fos.close();
				bfr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

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

		System.out.print("복원할 파일명(.txt파일):");
		String fileName = sc.next();
		sc.nextLine();

		System.out.print("복원하여 저장할 파일명 (.png): ");
		String restoreFileName = sc.next();
		sc.nextLine(); // 버퍼 비우기

		try {
			bfr = new BufferedReader(new FileReader(fileName));
			fos = new FileOutputStream(restoreFileName);
			String line = ""; //한 라인씩 읽어오기 위한 변수
			while(true) {
				line = bfr.readLine();
				if(line == null) break;
				
				fos.write(line.getBytes());
			}
			System.out.println("복구완료. 폴더를 확인하세요.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("해당 파일을 찾을 수 없습니다.");
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
		System.out.println("복구할 파일명 : ");
		String fileName = sc.next();
		sc.nextLine(); // 버퍼 비우기
		System.out.println("복구할 파일명 : ");
		String restoreFileName = sc.next();
		sc.nextLine(); // 버퍼 비우기

		BufferedWriter bfw = null;
		BufferedReader bfr = null;

		try {
			bfw = new BufferedWriter(new FileWriter(restoreFileName));
			bfr = new BufferedReader(new FileReader(fileName));
			String line = ""; // 한 라인씩 읽어오기 위한 변수
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

		System.out.print("복원할 파일명(.txt파일):");
		String fileName = sc.next();
		sc.nextLine();

		System.out.print("복원하여 저장할 파일명 (.png): ");
		String restoreFileName = sc.next();
		sc.nextLine(); // 버퍼 비우기

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
			System.out.println("복구완료. 폴더를 확인하세요.");
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

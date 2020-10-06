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

	// split으로 한 방법
	public void restoreFile() {
		BufferedReader bfr = null;
		FileOutputStream fos = null;

		System.out.print("복원할 파일명(.txt파일):");
		String fileName = sc.next();
		sc.nextLine();

		System.out.print("복원하여 저장할 파일명 (.gif): ");
		String restoreFileName = sc.next();
		sc.nextLine(); // 버퍼 비우기

		try {
			bfr = new BufferedReader(new FileReader(fileName));
			fos = new FileOutputStream(restoreFileName);
			String line = ""; // 한 라인씩 읽어오기 위한 변수

			while (true) {
				line = bfr.readLine();
				if (line == null)
					break;
				String[] restoreStr = line.split(" ");
				for (int i = 0; i < restoreStr.length; i++) {
					// 16진수의 파일에 있는 정보를 10진수로 바꾸는 작업
					fos.write(Integer.parseInt(restoreStr[i], 16));
				}
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
			String line = ""; // 한 라인씩 읽어오기 위한 변수

			line = bfr.readLine();
			StringTokenizer st = new StringTokenizer(line, " ");
			
			while(st.hasMoreTokens()) {
				fos.write(Integer.parseInt(st.nextToken(), 16));
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
				fos.close();
				bfr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

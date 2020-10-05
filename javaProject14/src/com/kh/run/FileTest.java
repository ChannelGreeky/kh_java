package com.kh.run;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest {
	private Scanner sc = new Scanner(System.in);

	public void fileSearch() {
		System.out.print("파일명 입력:");
		String fileName = sc.next();
		sc.nextLine();
		File file = new File(fileName);

		System.out.println("----- 파일 정보 보기 -----");
		if (file.exists()) {
			System.out.println("파일명:" + file.getName());
			System.out.println("해당 디렉토리:" + file.getParent());
			System.out.println("파일 상대경로:" + file.getPath());
			System.out.println("파일 절대경로:" + file.getAbsolutePath());
			System.out.println("파일의 크기:" + file.length() + "Byte");
		} else {
			System.out.println("파일이 없습니다.");
		}
	}

	public void charOutputStream() {
		FileWriter fw = null;
		System.out.println("저장할 파일 명:");
		String fileName = sc.next();
		sc.nextLine();

		try {
			fw = new FileWriter(fileName);
			System.out.println(fileName + "파일에 저장될 내용 입력(종료 exit)");
			int lineNumber = 1;
			do {
				System.out.print((lineNumber++) + ":");
				String str = sc.nextLine();

				if (str.equals("exit")) {
					break;
				} else {
					fw.write(str + "\r\n");
				}

			} while (true);
			System.out.println("작성 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void byteInputStream() {
		FileInputStream fis = null;

		System.out.print("읽어올 파일명:");
		String fileName = sc.next();
		sc.nextLine();

		File file = new File(fileName);

		try {
			fis = new FileInputStream(file);

			do {
				int data = 0;
				if ((data = fis.read()) == -1) {
					break;
				} else {
					System.out.println((char)data);
				}
			} while (true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
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

	// 바이트 보조스트림을 이용해서 파일을 새롭게 만들고 내용을 저장하는 코드
	public void byteOutputSubStream() {
		DataOutputStream dos = null;

		System.out.print("생성할 파일명 : ");
		String fileName = sc.next();
		sc.nextLine(); // 버퍼 비우기

		try {
			dos = new DataOutputStream(new FileOutputStream(fileName));

			System.out.println("보조스트림 사용");
			System.out.println(fileName + " 파일에 저장될 내용 입력(종료는 exit)");
			int lineNumber = 1;

			do {
				System.out.println((lineNumber++) + " : ");
				String str = sc.nextLine();
				if (str.equals("exit")) {
					break;
				} else {
					dos.writeChars(str);
				}
			} while (true);
			System.out.println("파일 저장 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void byteOutputStream() {
		FileOutputStream fos = null;

		System.out.print("생성할 파일명 : ");
		String fileName = sc.next();
		sc.nextLine(); // 버퍼 비우기

		try {
			fos = new FileOutputStream(fileName);
			System.out.println(fileName + " 파일에 저장될 내용 입력(종료는 exit)");
			int lineNumber = 1;

			do {
				System.out.println((lineNumber++) + " : ");
				String str = sc.nextLine() + "\r\n";
				if (str.equals("exit\r\n")) {
					break;
				} else {
					fos.write(str.getBytes());
				}
			} while (true);
			System.out.println("파일 저장 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

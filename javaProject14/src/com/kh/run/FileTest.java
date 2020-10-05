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
		System.out.print("���ϸ� �Է�:");
		String fileName = sc.next();
		sc.nextLine();
		File file = new File(fileName);

		System.out.println("----- ���� ���� ���� -----");
		if (file.exists()) {
			System.out.println("���ϸ�:" + file.getName());
			System.out.println("�ش� ���丮:" + file.getParent());
			System.out.println("���� �����:" + file.getPath());
			System.out.println("���� ������:" + file.getAbsolutePath());
			System.out.println("������ ũ��:" + file.length() + "Byte");
		} else {
			System.out.println("������ �����ϴ�.");
		}
	}

	public void charOutputStream() {
		FileWriter fw = null;
		System.out.println("������ ���� ��:");
		String fileName = sc.next();
		sc.nextLine();

		try {
			fw = new FileWriter(fileName);
			System.out.println(fileName + "���Ͽ� ����� ���� �Է�(���� exit)");
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
			System.out.println("�ۼ� �Ϸ�");
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

		System.out.print("�о�� ���ϸ�:");
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

	// ����Ʈ ������Ʈ���� �̿��ؼ� ������ ���Ӱ� ����� ������ �����ϴ� �ڵ�
	public void byteOutputSubStream() {
		DataOutputStream dos = null;

		System.out.print("������ ���ϸ� : ");
		String fileName = sc.next();
		sc.nextLine(); // ���� ����

		try {
			dos = new DataOutputStream(new FileOutputStream(fileName));

			System.out.println("������Ʈ�� ���");
			System.out.println(fileName + " ���Ͽ� ����� ���� �Է�(����� exit)");
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
			System.out.println("���� ���� �Ϸ�");
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

		System.out.print("������ ���ϸ� : ");
		String fileName = sc.next();
		sc.nextLine(); // ���� ����

		try {
			fos = new FileOutputStream(fileName);
			System.out.println(fileName + " ���Ͽ� ����� ���� �Է�(����� exit)");
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
			System.out.println("���� ���� �Ϸ�");
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

package com.kh.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class MyClientSocket {
	Scanner sc = new Scanner(System.in);

	public void start() {
		System.out.println("===========Ŭ���̾�Ʈ �ܼ�===========");
		// LoopBack �ּҴ� �ڱ� �ڽ��� �ּҸ� �� ��
		String serverIP = "192.168.30.41"; // ������

		// ������ ��Ʈ��ȣ
		int serverPort = 9000;

		// ������ �����ϱ� ���� ���� ���۷��� ����
		Socket socket = null;

		// �Է� ��Ʈ�� ���۷���
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			// ������ �ּ�(IP)�� ��Ʈ(Port)�� ������ �������� ������ ���� ���� (����)
			socket = new Socket(serverIP, serverPort);

			// �������� ������ �����͸� ���� �� �ֵ��� �Է� ��Ʈ�� ����
			OutputStream os = socket.getOutputStream();
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(os);
			while (true) {
				// �������� ������ �޼����� �о ����
				String serverMessage = dis.readUTF();
				// �������� ������ �޼����� ���
				if (serverMessage.equals("exit")) {
					System.out.println("������ ��ȭ�� �����Ͽ����ϴ�.");
					break;
				}
				System.out.println("�������� ������ �޼���:" + serverMessage);
				System.out.print("���� �޼���:");
				String sendMessage = sc.nextLine();
				if (sendMessage.equals("exit")) {
					System.out.println("��ȭ�� �����մϴ�.");
					break;
				}
				dos.writeUTF(sendMessage);
			}
		} catch (SocketException e) {
			System.err.println("������� ������ ���������ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dis.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

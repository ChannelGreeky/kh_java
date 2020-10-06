package com.kh.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class MyServerSocket {
	Scanner sc = new Scanner(System.in);

	public void start() {
		System.out.println("===========���� �ܼ�===========");
		// 1. ���� ��Ʈ��ȣ ����
		int port = 7777;

		// ������ ������ ���� ���۷���
		ServerSocket ss = null;

		// Ŭ���̾�Ʈ�� ��û�ϸ� �޾Ƶ��� �� �ֵ��� Ŭ���̾�Ʈ ������ ���� �Ǿ�� ��
		Socket clientSocket = null;

		// ������ ������� �ϱ� ���� ���۷���
		DataOutputStream dos = null;
		DataInputStream dis = null;

		try {
			// ���� ���� ����(��Ʈ ��ȣ�� ������ ������)
			ss = new ServerSocket(port);

			System.out.println("���� ���� ���� �Ϸ�");

			// Ŭ���̾�Ʈ�� �����ϸ� ������ �޾Ƶ��̰�(accept), �װ�����
			// �ش� Ŭ���̾�Ʈ���� ��� ������ ����� ��� ��
			// clientSocket �ȿ��� ������ Ŭ���̾�Ʈ�� �������� ��� ����
			clientSocket = ss.accept();
			System.out.println(clientSocket.getInetAddress() + "����ڰ� �����Ͽ����ϴ�.");

			// �����͸� �ְ� ���� ��Ʈ�� ����
			OutputStream os = clientSocket.getOutputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(clientSocket.getInputStream());
			// �������� Ŭ���̾�Ʈ�� ��½�Ʈ���� ���� ������ ����
			while (true) {
				System.out.print("���� �޼���:");
				String sendMessage = sc.nextLine();
				if (sendMessage.equals("exit")) {
					System.out.println("��ȭ�� �����մϴ�.");
					break;
				}
				dos.writeUTF(sendMessage);
				String clientMessage = dis.readUTF();
				if (clientMessage.equals("exit")) {
					System.out.println("������ ��ȭ�� �����Ͽ����ϴ�.");
					break;
				}
				System.out.println(clientSocket.getInetAddress() + ":" + clientMessage);
			}

		} catch (SocketException e) {
			System.err.println("������� ������ ���������ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				clientSocket.close();
				dos.close();
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

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
		System.out.println("===========클라이언트 콘솔===========");
		// LoopBack 주소는 자기 자신의 주소를 뜻 함
		String serverIP = "192.168.30.41"; // 루프백

		// 서버의 포트번호
		int serverPort = 9000;

		// 서버를 접속하기 위한 소켓 래퍼런스 생성
		Socket socket = null;

		// 입력 스트림 래퍼런스
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			// 서버의 주소(IP)와 포트(Port)를 가지고 서버에게 접속할 소켓 생성 (접속)
			socket = new Socket(serverIP, serverPort);

			// 서버에서 보내온 데이터를 받을 수 있도록 입력 스트림 생성
			OutputStream os = socket.getOutputStream();
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(os);
			while (true) {
				// 서버에서 보내온 메세지를 읽어서 저장
				String serverMessage = dis.readUTF();
				// 서버에서 보내온 메세지를 출력
				if (serverMessage.equals("exit")) {
					System.out.println("상대방이 대화를 종료하였습니다.");
					break;
				}
				System.out.println("서버에서 보내온 메세지:" + serverMessage);
				System.out.print("보낼 메세지:");
				String sendMessage = sc.nextLine();
				if (sendMessage.equals("exit")) {
					System.out.println("대화를 종료합니다.");
					break;
				}
				dos.writeUTF(sendMessage);
			}
		} catch (SocketException e) {
			System.err.println("상대방과의 연결이 끊어졌습니다.");
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

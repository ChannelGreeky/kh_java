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
		System.out.println("===========서버 콘솔===========");
		// 1. 서버 포트번호 설정
		int port = 7777;

		// 서버를 구성할 소켓 래퍼런스
		ServerSocket ss = null;

		// 클라이언트가 요청하면 받아들일 수 있도록 클라이언트 소켓이 생성 되어야 함
		Socket clientSocket = null;

		// 데이터 입출력을 하기 위한 래퍼런스
		DataOutputStream dos = null;
		DataInputStream dis = null;

		try {
			// 서버 소켓 생성(포트 번호를 가지고 생성함)
			ss = new ServerSocket(port);

			System.out.println("서버 소켓 생성 완료");

			// 클라이언트가 접속하면 서버는 받아들이고(accept), 그것으로
			// 해당 클라이언트와의 통신 소켓을 만들어 사용 함
			// clientSocket 안에는 접속한 클라이언트의 정보들이 담겨 있음
			clientSocket = ss.accept();
			System.out.println(clientSocket.getInetAddress() + "사용자가 접속하였습니다.");

			// 데이터를 주고 받을 스트림 구현
			OutputStream os = clientSocket.getOutputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(clientSocket.getInputStream());
			// 서버에서 클라이언트로 출력스트림을 통한 데이터 전송
			while (true) {
				System.out.print("보낼 메세지:");
				String sendMessage = sc.nextLine();
				if (sendMessage.equals("exit")) {
					System.out.println("대화를 종료합니다.");
					break;
				}
				dos.writeUTF(sendMessage);
				String clientMessage = dis.readUTF();
				if (clientMessage.equals("exit")) {
					System.out.println("상대방이 대화를 종료하였습니다.");
					break;
				}
				System.out.println(clientSocket.getInetAddress() + ":" + clientMessage);
			}

		} catch (SocketException e) {
			System.err.println("상대방과의 연결이 끊어졌습니다.");
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

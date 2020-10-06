package com.kh.run;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ShServerSocket {
	Scanner sc = new Scanner(System.in);
	public void start() {
		System.out.println("=========SngHyun's Server=========");
		
		int port = 7777;
		
		ServerSocket ss = null;
		
		Socket clientSocket = null;
		
		DataOutputStream dos = null;
		
		try {
			ss = new ServerSocket(port);
			
			System.out.println("서버 소켓 생성 완료");
			
			clientSocket = ss.accept();
			
			OutputStream os = clientSocket.getOutputStream();
			dos = new DataOutputStream(os);
			while(true) {
				System.out.print("채팅내용:");
				dos.writeUTF(sc.nextLine());
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				dos.close();
				ss.close();
				clientSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

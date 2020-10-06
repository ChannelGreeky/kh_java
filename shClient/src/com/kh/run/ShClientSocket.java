package com.kh.run;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ShClientSocket {
	public void start() {
		String serverIP = "127.0.0.1";
		
		int serverPort=7777;
		
		Socket socket = null;
		
		DataInputStream dis = null;
		
		try {
			socket = new Socket(serverIP,serverPort);
			
			dis = new DataInputStream(socket.getInputStream());
			
			String serverMessage = dis.readUTF();
			
			System.out.println("서버에서 보내온 메시지:"+serverMessage);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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

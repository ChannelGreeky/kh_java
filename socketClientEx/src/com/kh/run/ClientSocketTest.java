package com.kh.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ClientSocketTest {
	Scanner sc = new Scanner(System.in);
	public void start() {
		int port = 9999;
		
		String serverIP = "127.0.0.1";
		
		Socket socket = null;
		
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			socket = new Socket(serverIP, port);
			
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			String getMessage = dis.readUTF();
			System.out.println("("+clock()+")Server:"+getMessage);
			while(true) {
				System.out.print("보낼 메세지:");
				String sendMessage = sc.nextLine();
				if(sendMessage.equals("q")) {
					System.out.println("대화를 종료합니다.");
					break;
				}
				dos.writeUTF(sendMessage);
				
				getMessage = dis.readUTF();
				if(getMessage.equals("q")) {
					System.out.println("상대방이 대화방을 나갔습니다.");
					break;
				}
				System.out.println("("+clock()+")Server:"+getMessage);
			}
		} catch(NullPointerException e) {
			System.err.println("Closed Server.....");
		}  catch(EOFException e) {
			System.err.println("상대방과의 연결이 끊어졌습니다.");
		} catch (SocketException e) {
			System.err.println("상대방과의 연결이 끊어졌습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				dis.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public String clock() {
		Date day = new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("[HH:mm:ss]");
		String time = sdf.format(day);
		
		return time;
	}
}

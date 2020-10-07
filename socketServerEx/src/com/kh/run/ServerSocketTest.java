package com.kh.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ServerSocketTest {
	Scanner sc = new Scanner(System.in);
	public void start() {
		int port = 9999;
		
		ServerSocket ss = null;
		
		Socket socket =null;
		
		DataOutputStream dos = null;
		DataInputStream dis = null;		
		try {
			ss = new ServerSocket(port);
			System.out.println(clock()+port+"��ȣ listen OK!!");
			
			socket = ss.accept();
			System.out.println(clock()+socket.getInetAddress()+"���� �����Ͽ����ϴ�.");
			
			dos = new DataOutputStream(socket.getOutputStream());
			dis = new DataInputStream(socket.getInputStream());
			dos.writeUTF("�١ڡ١ڡ١ڡ١ڡ١�Welcome�١ڡ١ڡ١ڡ١ڡ١�");
			
			while(true) {
				String getMessage = dis.readUTF();
				if(getMessage.equals("q")) {
					System.out.println("������ ��ȭ���� �������ϴ�.");
				}
				System.out.println("("+clock()+")Client:"+getMessage);
				
				System.out.print("���� �޼���:");
				String sendMessage = sc.nextLine();
				if(sendMessage.equals("q")) {
					System.out.println("��ȭ�� �����մϴ�.");
				}
				dos.writeUTF(sendMessage);	
			}
		} catch(EOFException e) {
			System.err.println("������� ������ ���������ϴ�.");
		} catch (SocketException e){
			System.err.println("������� ������ ���������ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				socket.close();
				ss.close();
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

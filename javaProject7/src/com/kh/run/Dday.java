package com.kh.run;

import java.util.Calendar;
import java.util.Scanner;

public class Dday {
	public void start() {
		Scanner sc = new Scanner(System.in);
		Calendar destination = Calendar.getInstance();
		int[] Dday= new int[3];
		Calendar today = Calendar.getInstance();
		long mili_count=0, count=0;
		// getInstance �޼ҵ带 ���� �ڽ� ��ü�� ����(GregorianCalendar)	
		
		System.out.println("---�Է�---");
		System.out.print("D-Day[�⵵]:");
		Dday[0]=sc.nextInt();
		System.out.print("D-Day[��]:");
		Dday[1]=sc.nextInt();
		System.out.print("D-Day[��]:");
		Dday[2]=sc.nextInt();
		
		destination.set(Calendar.YEAR, Dday[0]);
		destination.set(Calendar.MONTH, Dday[1]-1);
		destination.set(Calendar.DATE, Dday[2]);
		
		mili_count = destination.getTimeInMillis()-today.getTimeInMillis();
		
		count = ((mili_count/1000)/60/60/24); 
		
		System.out.println("���� ��¥:"+today.get(Calendar.YEAR)+"�� "
						+(today.get(Calendar.MONTH)+1)+"�� "
						+today.get(Calendar.DATE)+"��");
		System.out.println("D-Day��¥:"+destination.get(Calendar.YEAR)+"�� "
				+(destination.get(Calendar.MONTH)+1)+"�� "
				+destination.get(Calendar.DATE)+"��");
		
		System.out.println("D-Day���� " + count + "�� ���ҽ��ϴ�.");
	}
}

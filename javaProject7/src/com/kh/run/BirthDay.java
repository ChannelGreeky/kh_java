package com.kh.run;

import java.util.Calendar;
import java.util.Scanner;

public class BirthDay {
	public void start() {
		Scanner sc = new Scanner(System.in);
		Calendar birth = Calendar.getInstance();
		int[] birthDay= new int[3];
		Calendar today = Calendar.getInstance();
		long mili_count=0, count=0;
		// getInstance �޼ҵ带 ���� �ڽ� ��ü�� ����(GregorianCalendar)	
		
		System.out.println("---������� �Է�---");
		System.out.print("����⵵(4�ڸ�����):");
		birthDay[0]=sc.nextInt();
		System.out.print("�����(1~12):");
		birthDay[1]=sc.nextInt();
		System.out.print("�����(1~31):");
		birthDay[2]=sc.nextInt();
		
		birth.set(Calendar.YEAR, birthDay[0]);
		birth.set(Calendar.MONTH, birthDay[1]);
		birth.set(Calendar.DATE, birthDay[2]);
		
		mili_count = today.getTimeInMillis()-birth.getTimeInMillis();
		
		count = ((mili_count/1000)/60/60/24); 
		System.out.println("������� ��ƿ� �ϼ�:"+count+"��");
	}
}

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
		// getInstance 메소드를 통해 자식 객체를 생성(GregorianCalendar)	
		
		System.out.println("---생년월일 입력---");
		System.out.print("출생년도(4자리숫자):");
		birthDay[0]=sc.nextInt();
		System.out.print("출생월(1~12):");
		birthDay[1]=sc.nextInt();
		System.out.print("출생일(1~31):");
		birthDay[2]=sc.nextInt();
		
		birth.set(Calendar.YEAR, birthDay[0]);
		birth.set(Calendar.MONTH, birthDay[1]);
		birth.set(Calendar.DATE, birthDay[2]);
		
		mili_count = today.getTimeInMillis()-birth.getTimeInMillis();
		
		count = ((mili_count/1000)/60/60/24); 
		System.out.println("현재까지 살아온 일수:"+count+"일");
	}
}

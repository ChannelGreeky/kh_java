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
		// getInstance 메소드를 통해 자식 객체를 생성(GregorianCalendar)	
		
		System.out.println("---입력---");
		System.out.print("D-Day[년도]:");
		Dday[0]=sc.nextInt();
		System.out.print("D-Day[월]:");
		Dday[1]=sc.nextInt();
		System.out.print("D-Day[일]:");
		Dday[2]=sc.nextInt();
		
		destination.set(Calendar.YEAR, Dday[0]);
		destination.set(Calendar.MONTH, Dday[1]-1);
		destination.set(Calendar.DATE, Dday[2]);
		
		mili_count = destination.getTimeInMillis()-today.getTimeInMillis();
		
		count = ((mili_count/1000)/60/60/24); 
		
		System.out.println("오늘 날짜:"+today.get(Calendar.YEAR)+"년 "
						+(today.get(Calendar.MONTH)+1)+"월 "
						+today.get(Calendar.DATE)+"일");
		System.out.println("D-Day날짜:"+destination.get(Calendar.YEAR)+"년 "
				+(destination.get(Calendar.MONTH)+1)+"월 "
				+destination.get(Calendar.DATE)+"일");
		
		System.out.println("D-Day까지 " + count + "일 남았습니다.");
	}
}

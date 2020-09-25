package com.kh.run;

import java.util.Calendar;

public class CurrentTime {
	public void start() {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();
		// getInstance 메소드를 통해 자식 객체를 생성(GregorianCalendar)
		String am_pm = "", day = "";
		StringBuffer sb = new StringBuffer();

		sb.append(today.get(Calendar.YEAR) + "년 ");
		sb.append(today.get(Calendar.MONTH) + "월 ");
		sb.append(today.get(Calendar.DATE) + "일 ");

		switch (today.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			day = "일요일";
			sb.append("일요일 ");
			break;
		case 2:
			day = "월요일";
			sb.append("월요일 ");
			break;
		case 3:
			day = "화요일";
			sb.append("화요일 ");
			break;
		case 4:
			day = "수요일";
			sb.append("수요일 ");
			break;
		case 5:
			day = "목요일";
			sb.append("목요일 ");
			break;
		case 6:
			day = "금요일";
			sb.append("금요일 ");
			break;
		case 7:
			day = "토요일";
			sb.append("토요일 ");
			break;
		}

		switch (today.get(Calendar.AM_PM)) {
		case 0:
			am_pm = "오전";
			sb.append("오전 ");
			break;
		case 1:
			am_pm = "오후";
			sb.append("오후 ");
			break;
		}

		sb.append(today.get(Calendar.HOUR) + "시 ");
		sb.append(today.get(Calendar.MINUTE) + "분 ");
		sb.append(today.get(Calendar.SECOND) + "초 ");

		System.out.print(today.get(Calendar.YEAR) + "년 "); // 년
		System.out.print((today.get(Calendar.MONTH) + 1) + "월 "); // 월 MONTH는 0부터 시작이라 +1해줘야 함
		System.out.print(today.get(Calendar.DATE) + "일 "); // 일
		System.out.print(day + " "); // 요일 (1=일요일)
		System.out.print(am_pm + " "); // AM_PM형식 (AM==0/PM==1)
		System.out.print(today.get(Calendar.HOUR) + "시 "); // 시간
		System.out.print(today.get(Calendar.MINUTE) + "분 "); // 분
		System.out.print(today.get(Calendar.SECOND) + "초 "); // 초

		System.out.println();
		System.out.println();

		System.out.println(sb);
	}
}

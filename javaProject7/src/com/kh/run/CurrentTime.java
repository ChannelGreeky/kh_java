package com.kh.run;

import java.util.Calendar;

public class CurrentTime {
	public void start() {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();
		// getInstance �޼ҵ带 ���� �ڽ� ��ü�� ����(GregorianCalendar)
		String am_pm = "", day = "";
		StringBuffer sb = new StringBuffer();

		sb.append(today.get(Calendar.YEAR) + "�� ");
		sb.append(today.get(Calendar.MONTH) + "�� ");
		sb.append(today.get(Calendar.DATE) + "�� ");

		switch (today.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			day = "�Ͽ���";
			sb.append("�Ͽ��� ");
			break;
		case 2:
			day = "������";
			sb.append("������ ");
			break;
		case 3:
			day = "ȭ����";
			sb.append("ȭ���� ");
			break;
		case 4:
			day = "������";
			sb.append("������ ");
			break;
		case 5:
			day = "�����";
			sb.append("����� ");
			break;
		case 6:
			day = "�ݿ���";
			sb.append("�ݿ��� ");
			break;
		case 7:
			day = "�����";
			sb.append("����� ");
			break;
		}

		switch (today.get(Calendar.AM_PM)) {
		case 0:
			am_pm = "����";
			sb.append("���� ");
			break;
		case 1:
			am_pm = "����";
			sb.append("���� ");
			break;
		}

		sb.append(today.get(Calendar.HOUR) + "�� ");
		sb.append(today.get(Calendar.MINUTE) + "�� ");
		sb.append(today.get(Calendar.SECOND) + "�� ");

		System.out.print(today.get(Calendar.YEAR) + "�� "); // ��
		System.out.print((today.get(Calendar.MONTH) + 1) + "�� "); // �� MONTH�� 0���� �����̶� +1����� ��
		System.out.print(today.get(Calendar.DATE) + "�� "); // ��
		System.out.print(day + " "); // ���� (1=�Ͽ���)
		System.out.print(am_pm + " "); // AM_PM���� (AM==0/PM==1)
		System.out.print(today.get(Calendar.HOUR) + "�� "); // �ð�
		System.out.print(today.get(Calendar.MINUTE) + "�� "); // ��
		System.out.print(today.get(Calendar.SECOND) + "�� "); // ��

		System.out.println();
		System.out.println();

		System.out.println(sb);
	}
}

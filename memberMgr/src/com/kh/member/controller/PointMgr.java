package com.kh.member.controller;

import com.kh.member.vo.Grade;

/*
 * ȸ������ �Է� (�Ѹ� �Է�)
ȸ������ ��� (��ü���)
* ȸ������ �˻� (�Ѹ� ���� �˻� �� ���)
ȸ������ ���� (�˻�)
ȸ������ ���� (Ư�� ��� ����)
* ȸ������ ��ü����
 */

public interface PointMgr {
	public void memberInsertData();
	public void memberModifyData();
	public void memberAllPrintData();
	public void memberDeleteData();
	public int searchMember(String name);
}






package com.kh.run;

import com.kh.point.controller.PntMgr;
import com.kh.point.vo.*; //com.kh.point.vo �Ʒ��� �ִ� ��� Ŭ���� import


public class TestMain {

	public static void main(String[] args) {
		PntMgr mgr = new PntMgr();
		
		mgr.insertData(new Silver("ȫ�浿","�ǹ�",1000));
		mgr.insertData(new Gold("��Ȳ��","���",1000));
		mgr.insertData(new Vip("�����","VIP",1000));
		mgr.insertData(new Vvip("�����","VvIP",1000));
		mgr.printData();
	}

}

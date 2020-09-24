package com.kh.run;

import com.kh.point.controller.PntMgr;
import com.kh.point.vo.*; //com.kh.point.vo 아래에 있는 모든 클래스 import


public class TestMain {

	public static void main(String[] args) {
		PntMgr mgr = new PntMgr();
		
		mgr.insertData(new Silver("홍길동","실버",1000));
		mgr.insertData(new Gold("김황금","골드",1000));
		mgr.insertData(new Vip("김브이","VIP",1000));
		mgr.insertData(new Vvip("김쁘이","VvIP",1000));
		mgr.printData();
	}

}

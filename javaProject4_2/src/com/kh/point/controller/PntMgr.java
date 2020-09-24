package com.kh.point.controller;

import com.kh.point.vo.*;//com.kh.point.vo 아래에 있는 모든 클래스 import


public class PntMgr {
	private int index=0;
	/*private Silver[] svArr = new Silver[10];
	private Gold[] gdArr = new Gold[10];
	private Vip[] vpArr = new Vip[10];
	private Vvip[] vvpArr = new Vvip[10];*/
	private Grade[] gArr=new Grade[30];
	
	public void insertData(Grade gr) {
		this.gArr[index++]=gr;
	}
	
	
	public void printData() {
		System.out.println("-----출 력-----");
		System.out.println("이름\t등급\t포인트\t이자포인트");
		for(int i=0;i<index;i++) {
			System.out.println(gArr[i].getName()+"\t"+
								gArr[i].getGrade()+"\t"+
								gArr[i].getPoint()+"\t"+
								gArr[i].getInterest());
		}
	}
	
}

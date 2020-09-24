package com.kh.point.controller;

import com.kh.point.vo.Gold;
import com.kh.point.vo.Silver;
import com.kh.point.vo.Vip;

public class PntMgr {
	int indexS=0;
	int indexG=0;
	int indexV=0;
	Silver[] svArr = new Silver[10];
	Gold[] gdArr = new Gold[10];
	Vip[] vpArr = new Vip[10];
	
	public PntMgr() {}
	
	public void insertData(Silver sv) {
		svArr[indexS++] = sv;
	}
	public void insertData(Gold gd) {	//�����ε�
		gdArr[indexG++] = gd;
	}
	public void insertData(Vip vp) {	//�����ε�
		vpArr[indexV++] = vp;
	}
	
	public void printData() {
		System.out.println("******* �� �� ******");
		System.out.println("�̸�\t���\t����Ʈ\t��������Ʈ");
		for(int i=0;i<indexS;i++) {
			System.out.println(svArr[i].getName()+"\t"+
								svArr[i].getGrade()+"\t"+
								svArr[i].getPoint()+"\t"+
								svArr[i].getInterest());
		}
		for(int i=0;i<indexG;i++) {
			System.out.println(gdArr[i].getName()+"\t"+
								gdArr[i].getGrade()+"\t"+
								gdArr[i].getPoint()+"\t"+
								gdArr[i].getInterest());
		}
		for(int i=0;i<indexV;i++) {
			System.out.println(vpArr[i].getName()+"\t"+
								vpArr[i].getGrade()+"\t"+
								vpArr[i].getPoint()+"\t"+
								vpArr[i].getInterest());
		}
	}

}

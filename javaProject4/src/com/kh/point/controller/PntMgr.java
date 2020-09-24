package com.kh.point.controller;

import com.kh.point.vo.Gold;
import com.kh.point.vo.Grade;
import com.kh.point.vo.Silver;
import com.kh.point.vo.Vip;
import com.kh.point.vo.Vvip;

public class PntMgr {
	private Grade [] g = new Grade[30];
	private int index = 0;
	
	public PntMgr() {}
		
	public void insertData(Grade g) {
		this.g[index++] = g;
	}
	
	
	public void printData()
	{
		System.out.println("☆☆☆☆☆☆☆ 회원 정보 출력 ☆☆☆☆☆☆☆☆");
		System.out.println("이름 \t\t 등급 \t\t 포인트 \t\t 이자포인트");
		for(int i=0;i<this.index;i++)
		{
			System.out.println(g[i].getName() +" \t\t " +
							g[i].getGrade() +" \t\t " +
							g[i].getPoint() + " \t\t " +
							g[i].getInterest());
			
		}
		
		
		
	}
	
	
}










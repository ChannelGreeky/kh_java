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
		System.out.println("�١١١١١١� ȸ�� ���� ��� �١١١١١١١�");
		System.out.println("�̸� \t\t ��� \t\t ����Ʈ \t\t ��������Ʈ");
		for(int i=0;i<this.index;i++)
		{
			System.out.println(g[i].getName() +" \t\t " +
							g[i].getGrade() +" \t\t " +
							g[i].getPoint() + " \t\t " +
							g[i].getInterest());
			
		}
		
		
		
	}
	
	
}










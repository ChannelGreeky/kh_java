package com.kh.point.vo;

public class Silver extends Grade{
	public Silver() {} //디폴트 생성자
	public Silver(String name, String grade, int point) 
	{super(name,grade,point);}
	
	
	@Override
	public double getInterest() { 		
		return this.point*0.02;
	}

	
}






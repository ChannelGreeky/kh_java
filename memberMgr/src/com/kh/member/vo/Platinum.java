package com.kh.member.vo;

public class Platinum extends Grade{
	public Platinum() {}
	public Platinum(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getInterest() {
		// TODO Auto-generated method stub
		return this.point*0.2;
	}
}

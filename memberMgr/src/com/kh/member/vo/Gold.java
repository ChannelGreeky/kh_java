package com.kh.member.vo;

public class Gold extends Grade{
	public Gold() {}
	public Gold(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getInterest() {
		// TODO Auto-generated method stub
		return this.point*0.03;
	}
}

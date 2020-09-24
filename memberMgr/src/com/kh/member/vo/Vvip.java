package com.kh.member.vo;

public class Vvip extends Grade{
	public Vvip() {}
	public Vvip(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getInterest() {
		// TODO Auto-generated method stub
		return this.point*0.1;
	}
}

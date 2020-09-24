package com.kh.member.vo;

public class Vip extends Grade{
	public Vip() {}
	public Vip(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getInterest() {
		// TODO Auto-generated method stub
		return this.point*0.05;
	}
}

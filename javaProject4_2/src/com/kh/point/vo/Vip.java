package com.kh.point.vo;

public class Vip extends Grade{
	
	public Vip() {} //디폴트 생성자
	
	public Vip(String name, String grade, int point) {
		super(name,grade,point);
	}
	@Override
	public double getInterest() {
		return this.point*0.05;
	}
	
	/*public double getInterest() {
		return point*0.05;
		//이자 5%
	}*/

}

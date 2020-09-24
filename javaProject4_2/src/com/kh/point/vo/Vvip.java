package com.kh.point.vo;

public class Vvip extends Grade{
	
	public Vvip() {} //디폴트 생성자
	
	public Vvip(String name, String grade, int point) {
		super(name,grade,point);
	}
	@Override
	public double getInterest() {
		return this.point*0.1;
	}
	
	/*public double getInterest() {
		return point*0.10;
		//이자 10%
	}*/

}

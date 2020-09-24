package com.kh.point.vo;

public class Gold extends Grade{
	
	public Gold() {} //디폴트 생성자
	
	public Gold(String name, String grade, int point) {
		super(name,grade,point);
	}
	
	@Override
	public double getInterest() {
		return this.point*0.03;
	}
	
	/*public double getInterest() {
		return point*0.03;
		//이자 3%
	}*/

}

package com.kh.point.vo;

public class Silver extends Grade{
	
	public Silver() {} //����Ʈ ������
	
	public Silver(String name, String grade, int point) {
		super(name,grade,point);
	}
	
	@Override
	public double getInterest() {
		return this.point*0.02;
	}
	


}

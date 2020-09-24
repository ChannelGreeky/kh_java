package com.kh.point.vo;

public class Silver {
	private String name; //회원 이름
	private String grade;//회원 등급
	private int point; //회원 점수
	
	
	public Silver() {} //디폴트 생성자
	
	public Silver(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	
	public double getInterest() {
		return point*0.02;
		//이자 2%
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	

}

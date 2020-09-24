package com.kh.point.vo;

public abstract class Grade { //추상메소드를 가지고 있음
	protected String name; //회원 이름
	protected String grade;//회원 등급
	protected int point; //회원 점수
	
	public Grade() {} //디폴트 생성자
	
	public Grade(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}

	public abstract double getInterest();//추상메소드 

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

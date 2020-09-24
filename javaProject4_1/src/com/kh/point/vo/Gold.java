package com.kh.point.vo;

public class Gold {
	private String name; //ȸ�� �̸�
	private String grade;//ȸ�� ���
	private int point; //ȸ�� ����
	
	
	public Gold() {} //����Ʈ ������
	
	public Gold(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	
	public double getInterest() {
		return point*0.03;
		//���� 3%
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

package com.kh.point.vo;

public class Vip {
	private String name; //ȸ�� �̸�
	private String grade;//ȸ�� ���
	private int point; //ȸ�� ����
	
	
	public Vip() {} //����Ʈ ������
	
	public Vip(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	
	public double getInterest() {
		return point*0.05;
		//���� 5%
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

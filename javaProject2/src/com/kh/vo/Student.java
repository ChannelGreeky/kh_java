package com.kh.vo;

public class Student {
	
	private String name; // �̸�
	private String id; // �й�
	private int age; // ����
	private String phone; // �л� ��ȭ��ȣ
	private String gender; //

//	public Student(){
//		
//	}
//	public Student(String name, String id, int age, String phone, String gender){
//		this.name=name;
//		this.id=id;
//		this.age=age;
//		this.phone=phone;
//		this.gender=gender;
//	}

	// set : ��������� ���� �����ϴ� ����
	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	// get : ��������� ���� �������� ����
	public String getName() {
		return this.name;
	}

	public String getId() {
		return this.id;
	}

	public int getAge() {
		return this.age;
	}

	public String getPhone() {
		return this.phone;
	}

	public String getGender() {
		return this.gender;
	}
}

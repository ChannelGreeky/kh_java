package com.kh.vo;

public class Student {

	private String name; // 이름
	private String id; // 학번
	private int age; // 나이
	private String phone; // 학생 전화번호
	private String gender; //

	// set : 멤버변수에 값을 대입하는 역할
	public void setName(String _name) {
		name = _name;
	}

	public void setId(String _id) {
		id = _id;
	}

	public void setAge(int _age) {
		age = _age;
	}

	public void setPhone(String _phone) {
		phone = _phone;
	}

	public void setGender(String _gender) {
		gender = _gender;
	}

	// get : 멤버변수의 값을 꺼내오는 역할
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getGender() {
		return gender;
	}
}

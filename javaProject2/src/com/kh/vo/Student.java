package com.kh.vo;

public class Student {
	
	private String name; // 이름
	private String id; // 학번
	private int age; // 나이
	private String phone; // 학생 전화번호
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

	// set : 멤버변수에 값을 대입하는 역할
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

	// get : 멤버변수의 값을 꺼내오는 역할
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

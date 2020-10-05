package com.kh.member.model.vo;

public class Member {
	private String id;
	private String name;
	private String jopGrade;
	private int age;
	private String address;

	public Member() {
		super();
	}

	public Member(String id, String name, String jopGrade, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.jopGrade = jopGrade;
		this.age = age;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJopGrade() {
		return jopGrade;
	}

	public void setJopGrade(String jopGrade) {
		this.jopGrade = jopGrade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return id + "/" + name + "/" + jopGrade + "/" + age + "/" + address;
	}
}

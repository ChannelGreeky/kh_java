package com.kh.vo;

public class Student {

	private String name; // �̸�
	private String id; // �й�
	private int age; // ����
	private String phone; // �л� ��ȭ��ȣ
	private String gender; //

	// set : ��������� ���� �����ϴ� ����
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

	// get : ��������� ���� �������� ����
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

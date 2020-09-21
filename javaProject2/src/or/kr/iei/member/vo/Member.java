package or.kr.iei.member.vo;

public class Member {
	private String name;
	private int age;
	private String address;
	private String phone;
	private String gender;

	public void setName(String _name) {
		name = _name;
	}

	public void setAge(int _age) {
		age = _age;
	}

	public void setAddress(String _address) {
		address = _address;
	}

	public void setPhone(String _phone) {
		phone = _phone;
	}

	public void setGender(String _gender) {
		gender = _gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getGender() {
		return gender;
	}

}

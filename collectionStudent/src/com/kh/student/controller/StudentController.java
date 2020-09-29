package com.kh.student.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.student.model.vo.Student;

public class StudentController {
	private ArrayList<Student> list = new ArrayList<Student>();

	public ArrayList<Student> selectAll() {
		ArrayList<Student> copyList = new ArrayList<Student>(list); // ���� ����Ʈ ���� �����ϱ� ���� ���纻���� �Ѱ���
		return copyList;
	}

	// �л� �Ѹ� ��ȸ �޼ҵ�
	public Student selectOne(int classNumber) {
		int i;
		Student vo = null;
		for (i = 0; i < list.size(); i++) {
			if (list.get(i).getClassNumber() == classNumber) {
				vo = list.get(i);
				break;
			}
		}
		return vo;
	}

	// �л� �Է� �޼ҵ�
	public Boolean insertStudent(Student s) {
		boolean result = list.add(s);

		return result;
	}

	// �л� ���� ���� �޼ҵ�
	public Boolean updateStudent(int classNumber, Student newStudent, int select) {
		for (Student i : list) {
			if (i.getClassNumber() == classNumber) {
				switch (select) {
				case 1:
					i.setClassNumber(newStudent.getClassNumber());
					break;
				case 2:
					i.setName(newStudent.getName());
					break;
				case 3:
					i.setAge(newStudent.getAge());
					break;
				case 4:
					i.setAddress(newStudent.getAddress());
					break;
				case 5:
					i.setGrade(newStudent.getGrade());
					break;
				}

				return true;
			}
		}
		return false;
	}

	// �л� ���� ���� �޼ҵ�
	public Boolean deleteStudent(int classNumber) {
		int i = 0;
		for (i = 0; i < list.size(); i++) {
			if (list.get(i).getClassNumber() == classNumber) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}
	public void deleteStudent() {
		list.clear();
	}

	
	
	public Boolean check(int classNumber) {
		for (Student i : list) {
			if (i.getClassNumber() == classNumber) {
				return true;
			}
		}
		return false;
	}
}

package com.kh.student.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.student.model.vo.Student;

public class StudentController {
	private ArrayList<Student> list = new ArrayList<Student>();

	public ArrayList<Student> selectAll() {
		ArrayList<Student> copyList = new ArrayList<Student>(list); // 원본 리스트 접근 제한하기 위해 복사본으로 넘겨줌
		return copyList;
	}

	// 학생 한명 조회 메소드
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

	// 학생 입력 메소드
	public Boolean insertStudent(Student s) {
		boolean result = list.add(s);

		return result;
	}

	// 학생 정보 변경 메소드
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

	// 학생 정보 삭제 메소드
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

package com.kh.student.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.student.model.vo.Student;

public class StudentController {
	private ArrayList<Student> list = new ArrayList<Student>();
	
	public StudentController() {
		File file = new File("./student.dat");
		if(file.exists()) {
			loadData();
		}
	}

	public void insertData(Student s) {
		list.add(s);
	}

	public boolean printData() {
		if(list.isEmpty()) {
			return false;
		} else {
			for (Student s : list) {
				System.out.println(s);
			}
			return true;
		}
	}

	public boolean deleteData(String name) {
		if(list.isEmpty()) {
			return false;
		} else {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equals(name)) {
					list.remove(i);
					
					return true;
				}
			}
		}
		return false;
	}

	public boolean saveData() {
		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream("student.dat"));

			oos.writeObject(list);

			return true;
		} catch (IOException e) {
			return false;
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public boolean loadData() {
		File file = new File("./student.data");
		
		if(!file.exists()) {
			return false;
		}
		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream("student.dat"));

			list = (ArrayList<Student>)ois.readObject();

			return true;
			
		} catch (IOException e) {
			return false;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			return false;
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

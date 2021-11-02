package com.soniaGpe.firstspringboot.DAO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.soniaGpe.firstspringboot.Entity.Student;


public class StudentDaoImpl{

	private static Map<Integer, Student> students;
	static {
		students = new HashMap<Integer, Student>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				put(1, new Student(1, "Sonia", "Computer Science"));
				put(2, new Student(2, "Taty", "Finance"));
				put(3, new Student(3, "Hans", "Data Science"));
				put(4, new Student(4, "Cindy", "Human  Science"));

			}
		};

	}

	public Collection<Student> getAllStudent() {

		return StudentDaoImpl.students.values();
	}

	public Student getStudentById(int id) {
		return StudentDaoImpl.students.get(id);
	}

	public void removeStudentById(int id) {
		StudentDaoImpl.students.remove(id);
	}

	public void updateStudent(Student st) {
		Student str = StudentDaoImpl.students.get(st.getId());
		str.setCourse(st.getCourse());
		str.setName(st.getName());
		students.put(str.getId(), str);
	}

	public void insereStudent(Student st) {
		st.setCourse(st.getCourse());
		st.setName(st.getName());
		students.put(st.getId(), st);
	}

}

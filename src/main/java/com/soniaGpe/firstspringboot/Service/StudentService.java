package com.soniaGpe.firstspringboot.Service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soniaGpe.firstspringboot.DAO.StudentDaoImpl;
import com.soniaGpe.firstspringboot.DAO.StudentsDAO;
import com.soniaGpe.firstspringboot.Entity.Student;


@Service
public class StudentService {
	
	@Autowired
	private StudentsDAO studentDao;
	

public Collection<Student>getAllStudent(){
	 
	 return this.studentDao.findAll() ;
}
public Optional<Student> getStudentById(int id){
	return this.studentDao.findById(id);
}

public void removeStudentById(int id){
	studentDao.deleteById(id);;
}

public void insereStudent(Student st) {
	studentDao.save(st);	
}





}

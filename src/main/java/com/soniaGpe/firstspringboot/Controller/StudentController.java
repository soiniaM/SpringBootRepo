package com.soniaGpe.firstspringboot.Controller;

import java.awt.PageAttributes.MediaType;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.soniaGpe.firstspringboot.Entity.Student;
import com.soniaGpe.firstspringboot.Service.StudentService;

import antlr.collections.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
@GetMapping("/students")
public ResponseEntity<Collection<Student>>getAllStudent(){
	Collection<Student> students = new ArrayList<Student>();
    
    this.studentService.getAllStudent().forEach(students::add);
    if (students.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
    return new ResponseEntity<>(students, HttpStatus.OK);
	 
	 
}
@GetMapping(value = "/{id}")
public Optional<Student> getStudentById(@PathVariable("id") int id){
	return this.studentService.getStudentById(id);
}

@DeleteMapping("students/{id}")
public void removeStudentById(@PathVariable("id") int id){
	studentService.removeStudentById(id);
}


@PostMapping(path = "/students", consumes=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public void insereStudent(@RequestBody Student st) {
	studentService.insereStudent(st);
}


}

package com.example.springProjectOne;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("azeer", "Shaik");
	}
	
	@GetMapping("/students")
	public List<Student> getStudentList() {
		List<Student> list = new ArrayList<>();
		list.add(new Student("shaik", "Azeer"));
		list.add(new Student("azeer", "Saheb"));
		list.add(new Student("azeer", "Shaik"));
		list.add(new Student("Saheb", "Azeer"));
		return list;
	}

}

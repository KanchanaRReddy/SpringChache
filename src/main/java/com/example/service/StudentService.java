package com.example.service;

import java.util.List;

import com.example.model.Students;

public interface StudentService {
	public Students addStudent(Students emp);
	public List<Students> getAllStudent();
	public Students getStudentById(int id);
	public boolean deleteStudentById(int id);
	public String clearCache();
	public Students updateStudentMarks(int id, int marks);
	
}

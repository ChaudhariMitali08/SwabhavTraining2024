package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class StudentTest {
	private IStudentService studentService;
	private Student student;
	@BeforeEach
	void init() {
		studentService  = Mockito.mock(IStudentService.class);
		student = new Student(studentService);
	}

	@Test
	void testCalculatePercentage() {
		Mockito.when(studentService.getTotalMarks()).thenReturn(650);
		Mockito.when(studentService.getTotalNumberOfSubjects()).thenReturn(10);

		assertEquals(65,student.calculatePercentage());
	}
}
package com.project.test.engsoftwaretest;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.internal.util.MockUtil;

import funcionalities.book.Book;
import funcionalities.student.Student;

public class ManagerClassLendingTest {

	Book bookInstenceClass = null;
	Student studentInstenceClass = null;
	
	@Before
	public void setUpClass() {
		this.bookInstenceClass = Mockito.mock(Book.class);
		this.studentInstenceClass = Mockito.mock(Student.class);
	}
	
	@Test
	public void funcionalitieCrudSaveTest() {
		
		
		
	}
	
	
}

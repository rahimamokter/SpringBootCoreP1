package com.icterguru.core;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.icterguru.core.entities.Student;
import com.icterguru.core.repos.IStudentRepository;
import com.icterguru.core.services.PaymentServiceImpl;

@SpringBootTest
class CoreApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@Autowired
	PaymentServiceImpl service;


	@Autowired
	IStudentRepository sRepository;

	@Test
	public void testDependencyInjection() {
		assertNotNull(service.getDao());
		
	}
	@Test
	public void testStudent() {
		Student student = new Student();
		student.setId(1L);
		student.setName("Mokter");
		student.setTestScore(98);
		
		sRepository.save(student);
		
		
		Student savedStudent1 = sRepository.findById(1L).get();
		
		assertNotNull(savedStudent1);
		
		
	}

}


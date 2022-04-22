package com.icterguru.core.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icterguru.core.entities.Student;

public interface IStudentRepository extends JpaRepository<Student, Long> {

}

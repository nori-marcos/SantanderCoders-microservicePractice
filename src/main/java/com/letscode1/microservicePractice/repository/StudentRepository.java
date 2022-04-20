package com.letscode1.microservicePractice.repository;

import com.letscode1.microservicePractice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}

package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entities.Student;

// change path to: http://localhost:8080/api/students:
@RepositoryRestResource(path = "students", collectionResourceRel = "MyStudents") // This will change the path of the REST API for students, set the base path in RestConfig.java, collectionResourceRel is the name of the JSON array

public interface StudentRepository extends JpaRepository<Student, Long> { // student is the entity, Long is the type of the primary key
    
}

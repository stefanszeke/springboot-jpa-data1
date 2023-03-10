package com.example.entities;

import jakarta.persistence.*;


@Entity // This tells Hibernate to make a table out of this class
@Table(name = "students")
public class Student {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email") // This is optional, because the column name is the same as the field name
    private String email;

    // public Student() {} // This is a default constructor, it is required by Hibernate

    // public Student(Long id, String firstName, String lastName, String email) {
    //     this.id = id;
    //     this.firstName = firstName;
    //     this.lastName = lastName;
    //     this.email = email;
    // }

    // getters and setters:

    // public Long getStudentId() { return id;} // This is the getter for the id field, it will expose the id of the entity as studentId 
    // public void setStudentId(Long id) { this.id = id; }
    
    public Long getId() { return id;} // This is the getter for the id field, it will expose the id of the entity if config.exposeIdsFor(Student.class) is added to RestConfig.java
    public void setId(Long id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}

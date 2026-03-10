package org.example.module_8_database.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;

@Entity
@Table(name = "teacher_detail")
public class Teacher {
    @Id
    @GeneratedValue
//    @Column(name = "id")
    int id;

    @Column(name = "teacher_name")
    String name;

    @Column(name = "teacher_age")
    int age;

    Teacher(String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

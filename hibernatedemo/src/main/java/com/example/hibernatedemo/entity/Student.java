package com.example.hibernatedemo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author jikangwang
 */
@Entity
@Data
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }


}

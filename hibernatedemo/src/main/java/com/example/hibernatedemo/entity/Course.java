package com.example.hibernatedemo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jikangwang
 */
@Entity
@Getter
@Setter
@ToString(exclude = "students")
@NoArgsConstructor
@Table
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    private String name;

    @ManyToMany(fetch = FetchType.EAGER,mappedBy = "courses")
    Set<Student> students=new HashSet<>();

    public Course(String name) {
        this.name = name;
    }

}

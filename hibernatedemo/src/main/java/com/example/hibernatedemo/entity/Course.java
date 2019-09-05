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
@Entity(name = "CCourse")
@Getter
@Setter
@ToString(exclude = "students")
@NoArgsConstructor
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;

    @ManyToMany(fetch = FetchType.EAGER,mappedBy = "courses")
    Set<Student> students=new HashSet<>();

    public Course(String name) {
        this.name = name;
    }

}

package com.example.springmvc.entity;

import lombok.*;

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
    private Long id;
    @NotNull
    private String name;

    @ManyToMany(fetch = FetchType.LAZY,mappedBy = "courses")
    Set<Student> students=new HashSet<>();


}

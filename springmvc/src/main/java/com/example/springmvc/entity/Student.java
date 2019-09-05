package com.example.springmvc.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jikangwang
 */
@Entity
@Data
@Getter
@Setter
@ToString(exclude = "courses")
@Table(name="student")
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;

    @ManyToMany(fetch = FetchType.LAZY,cascade = { CascadeType.ALL})
    @JoinTable(
            name = "sc",
            joinColumns = { @JoinColumn(name = "student_id") },
            inverseJoinColumns = { @JoinColumn(name = "course_id") }
    )
    Set<Course> courses=new HashSet<>();
}

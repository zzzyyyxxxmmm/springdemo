package com.wjk.hibernatedemo.entity;

import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jikangwang
 */
@Entity
@ToString(exclude = "courses")
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    private Address address;

    @Embedded
    @AttributeOverrides({
                    @AttributeOverride(
                            name = "address",
                            column = @Column(name = "bill_address")
                    )
            })
    private Address billAddress;

    @ManyToMany(fetch = FetchType.EAGER,cascade = { CascadeType.ALL })
    @JoinTable(
            name = "sc",
            joinColumns = { @JoinColumn(name = "student_id") },
            inverseJoinColumns = { @JoinColumn(name = "course_id") }
    )
    Set<Course> courses=new HashSet<>();

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }
}

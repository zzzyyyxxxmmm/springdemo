package com.wjk.hibernatedemo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jikangwang
 */
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "st_id")
    private Long id;

    @Column(name = "st_name")
    private String name;

    @OneToMany(mappedBy = "student")
    Set<Schedule> schedules=new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

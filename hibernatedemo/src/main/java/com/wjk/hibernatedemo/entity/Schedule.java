package com.wjk.hibernatedemo.entity;

import javax.persistence.*;

/**
 * @author jikangwang
 */
@Entity
@Table(name = "sc")
public class Schedule {
    @Id
    @Column(name = "sc_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long 	id;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course 	course;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student 	student;

    @Column(name = "sc_score")
    private Integer score;

}

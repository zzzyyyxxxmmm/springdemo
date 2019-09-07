package com.wjk.hibernatedemo.entity;

import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jikangwang
 */
@Entity(name = "CCourse")
@ToString(exclude = "students")
@NoArgsConstructor
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @ColumnTransformer(read = "size/2",
    write = "?*2" )
    private Integer size;

    @Formula("(select AVG(a.size) from Course a)")
    protected BigDecimal averageBidAmount;

    @Formula("substr(name,1,2) || '....' ")
    private String shortName;


    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "courses")
    Set<Student> students = new HashSet<>();

    public Course(String name) {
        this.name = name;
    }

    public Course(@NotNull String name, Integer size) {
        this.name = name;
        this.size = size;
    }

}

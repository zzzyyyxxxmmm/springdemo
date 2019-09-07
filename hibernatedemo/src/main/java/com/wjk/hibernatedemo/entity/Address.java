package com.wjk.hibernatedemo.entity;

import lombok.ToString;

import javax.persistence.Embeddable;

/**
 * @author jikangwang
 */
@Embeddable
@ToString
public class Address {
    private String address;
}

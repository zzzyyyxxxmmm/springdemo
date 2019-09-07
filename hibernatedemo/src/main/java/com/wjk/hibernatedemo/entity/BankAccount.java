package com.wjk.hibernatedemo.entity;

import lombok.ToString;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 * @author jikangwang
 */
@Entity
@ToString
public class BankAccount extends BillingDetails {
    @NotNull
    protected String account;
    @NotNull
    protected String bankName;
    @NotNull
    protected String swift;
}

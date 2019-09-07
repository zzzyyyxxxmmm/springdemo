package com.wjk.hibernatedemo.entity;

import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author jikangwang
 */
@Entity
@ToString
public class CreditCard extends BillingDetails {
    @NotNull
    protected String cardNumber;
    @NotNull
    protected String expMonth;
    @NotNull
    protected String expYear;
}

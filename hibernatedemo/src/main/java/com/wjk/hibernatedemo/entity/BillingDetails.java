package com.wjk.hibernatedemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;

/**
 * @author jikangwang
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BillingDetails {
    @Id
    protected Long id;

    @NotNull
    private String owner;

    @Override
    public String toString() {
        return "BillingDetails{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                '}';
    }
}

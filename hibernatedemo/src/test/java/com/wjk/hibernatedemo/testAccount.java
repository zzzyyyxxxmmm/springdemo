package com.wjk.hibernatedemo;

import com.wjk.hibernatedemo.dao.StudentDao;
import com.wjk.hibernatedemo.entity.BillingDetails;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author jikangwang
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class testAccount {

    @PersistenceContext
    public EntityManager em;


    @Autowired
    StudentDao studentDao;
    @Test
    public void findAccount() {
        //studentDao.findAll().forEach(System.out::println);
        List list= em.createQuery("select bd from BillingDetails bd").getResultList();
        for(Object s:list){
            BillingDetails billingDetails=(BillingDetails) s;
            System.out.println("****"+billingDetails.toString());
        }
        //list.forEach(System.out::println);
    }
}

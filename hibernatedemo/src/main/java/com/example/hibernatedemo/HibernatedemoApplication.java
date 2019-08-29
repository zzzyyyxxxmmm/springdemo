package com.example.hibernatedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.hibernatedemo.dao") // JPA扫描该包路径下的Repositorie
@EntityScan("com.example.hibernatedemo.entity") // 扫描Entity实体类
public class HibernatedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernatedemoApplication.class, args);
    }

}

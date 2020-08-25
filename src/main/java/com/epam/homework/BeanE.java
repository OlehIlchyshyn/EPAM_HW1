package com.epam.homework;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanE implements BeanValidator {
    private String name;
    private int value;

    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public BeanE(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public void validate() {
        if (this.name.isEmpty() || this.name.isBlank()) {
            System.out.println("BeanE :// name shouldn`t be null");
        }
        if (this.value < 0) {
            System.out.println("BeanE :// value should be positive");
        }
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("BeanE :// post contruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("BeanE :// pre destroy");
    }
}

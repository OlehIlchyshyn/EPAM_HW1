package com.epam.homework;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanA implements BeanValidator, InitializingBean, DisposableBean {
    private String name;
    private int value;

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public BeanA(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void validate() {
        if (this.name.isEmpty() || this.name.isBlank()) {
            System.out.println("BeanA :// name shouldn`t be null");
        }
        if (this.value < 0) {
            System.out.println("BeanA :// value should be positive");
        }
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanA :// destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanA :// after properties set");
    }
}

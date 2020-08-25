package com.epam.homework;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource("properties.yml")
public class BeanB implements BeanValidator {
    @Value("B")
    private String name;
    @Value("2")
    private int value;

    @Override
    public String toString() {
        return "BeanB{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
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
            System.out.println("BeanB :// name shouldn`t be null");
        }
        if (this.value < 0) {
            System.out.println("BeanB :// value should be positive");
        }
    }

    public void init() {
        System.out.println("BeanB :// init method");
    }

    public void destroy() {
        System.out.println("BeanB :// destroy method");
    }

    public void anotherInit() {
        System.out.println("BeanB :// another init method");
    }
}

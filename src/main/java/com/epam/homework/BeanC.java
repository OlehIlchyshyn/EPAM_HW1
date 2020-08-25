package com.epam.homework;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource("properties.yml")
public class BeanC implements BeanValidator {
    @Value("C")
    private String name;
    @Value("3")
    private int value;

    @Override
    public String toString() {
        return "BeanC{" +
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
            System.out.println("BeanC :// name shouldn`t be null");
        }
        if (this.value < 0) {
            System.out.println("BeanC :// value should be positive");
        }
    }

    public void init() {
        System.out.println("BeanC :// init method");
    }

    public void destroy() {
        System.out.println("BeanC :// destroy method");
    }
}

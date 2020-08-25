package com.epam.homework;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@PropertySource("properties.yml")
//@PropertySource("app.properties")
//@ConfigurationProperties(prefix = "beand")
public class BeanD implements BeanValidator {
    @Value("D")
    private String name;
    @Value("1")
    private int value;

    @Override
    public String toString() {
        return "BeanD{" +
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
            System.out.println("BeanD :// name shouldn`t be null");
        }
        if (this.value < 0) {
            System.out.println("BeanD :// value should be positive");
        }
    }

    public void init() {
        System.out.println("BeanD :// init method");
    }

    public void destroy() {
        System.out.println("BeanD :// destroy method");
    }
}

package com.epam.homework;

public class BeanF implements BeanValidator {
    private String name;
    private int value;

    @Override
    public String toString() {
        return "BeanF{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public void validate() {
        if (this.name.isEmpty() || this.name.isBlank()) {
            System.out.println("BeanF :// name shouldn`t be null");
        }
        if (this.value < 0) {
            System.out.println("BeanF :// value should be positive");
        }
    }
}

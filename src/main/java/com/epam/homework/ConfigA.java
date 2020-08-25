package com.epam.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class ConfigA {
    @Bean
    public MyBeanFactoryPostProcessor myBeanFactoryPostProcessor() {
        return new MyBeanFactoryPostProcessor();
    }

    @Bean MyBeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }

    @Bean(name = "beanD", initMethod = "init", destroyMethod = "destroy")
    public BeanD getBeanD() {
        return new BeanD();
    }

    @Bean(name = "beanB", initMethod = "init", destroyMethod = "destroy")
    public BeanB getBeanB() {
        return new BeanB();
    }

    @Bean(name = "beanC", initMethod = "init", destroyMethod = "destroy")
    public BeanC getBeanC() {
        return new BeanC();
    }

    @Bean(name = "beanF")
    @Lazy
    public BeanF getBeanF() {
        return new BeanF();
    }
}

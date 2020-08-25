package com.epam.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ConfigA.class)
public class ConfigB {
    @Bean
    @Autowired
    public BeanA beanA_BC(BeanB beanB, BeanC beanC) {
        return new BeanA(beanB.getName(), beanC.getValue());
    }

    @Bean
    @Autowired
    public BeanA beanA_BD(BeanB beanB, BeanD beanD) {
        return new BeanA(beanB.getName(), beanD.getValue());
    }

    @Bean
    @Autowired
    public BeanA beanA_CD(BeanC beanC, BeanD beanD) {
        return new BeanA(beanC.getName(), beanD.getValue());
    }

    @Bean
    @Autowired
    public BeanE beanE_A_BC(@Qualifier("beanA_BC") BeanA beanA) {
        return new BeanE(beanA.getName(), beanA.getValue());
    }

    @Bean
    @Autowired
    public BeanE beanE_A_BD(@Qualifier("beanA_BD") BeanA beanA) {
        return new BeanE(beanA.getName(), beanA.getValue());
    }

    @Bean
    @Autowired
    public BeanE beanE_A_CD(@Qualifier("beanA_CD") BeanA beanA) {
        return new BeanE(beanA.getName(), beanA.getValue());
    }
}

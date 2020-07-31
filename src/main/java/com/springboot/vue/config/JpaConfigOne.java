package com.springboot.vue.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.springboot.vue.repository",
    entityManagerFactoryRef = "entityManagerFactoryBeanOne",
    transactionManagerRef = "platformTransactionManagerOne")
public class JpaConfigOne {
    @Resource(name = "dataSourceOne")
    DataSource dataSourceOne;
    @Autowired
    JpaProperties jpaProperties;

    @Bean
    @Primary
    LocalContainerEntityManagerFactoryBean entityManagerFactoryBeanOne(EntityManagerFactoryBuilder builder) {
        return builder.dataSource(dataSourceOne)
                .properties(jpaProperties.getProperties())
                .packages("com.springboot.vue.entity")
                .persistenceUnit("pu1")
                .build();
    }

    @Bean
    PlatformTransactionManager platformTransactionManagerOne(EntityManagerFactoryBuilder builder) {
        LocalContainerEntityManagerFactoryBean factoryBeanOne = entityManagerFactoryBeanOne(builder);
        return new JpaTransactionManager(factoryBeanOne.getObject());
    }

}

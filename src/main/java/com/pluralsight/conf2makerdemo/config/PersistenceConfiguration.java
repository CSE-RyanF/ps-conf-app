package com.pluralsight.conf2makerdemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
//    @Bean
//    public DataSource dataSource(){
//        DataSourceBuilder builder= DataSourceBuilder.create();
//        builder.url("jdbc:postgresql://localhost:5432/postgres");
//        builder.username("postgres");
//        builder.password("Car");
//        System.out.println("My custom datasource bean has been initialized and set");
//        return builder.build();
//    }
}
//replaces the use of the properties config file
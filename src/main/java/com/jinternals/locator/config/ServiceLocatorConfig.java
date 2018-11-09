package com.jinternals.locator.config;

import com.jinternals.locator.services.MyMapper;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceLocatorConfig {

    @Bean
    public ServiceLocatorFactoryBean serviceLocatorFactoryBean(){
        ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();
        bean.setServiceLocatorInterface(MyMapper.class);
        return bean;
    }
}

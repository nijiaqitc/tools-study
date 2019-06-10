package com.njq.monitoring;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class MonitoringEventApplication implements ApplicationContextAware {

    public static void main(String[] args) {
        SpringApplication.run(MonitoringEventApplication.class, args);
    }

    private ApplicationContext app;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        applicationContext.getBean(MyEventTest.class).test();

        applicationContext.getBean(SystemTest.class).setObj();

        applicationContext.getBean(System1Test.class).setObj();
    }
}

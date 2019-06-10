package com.njq.monitoring;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * @author: nijiaqi
 * @date: 2019/6/10
 */
@Component
public class MyEventTest implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void test(){
        applicationEventPublisher.publishEvent(new MyEvent(this));
    }
}

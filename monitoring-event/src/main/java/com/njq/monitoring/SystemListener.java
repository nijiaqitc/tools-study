package com.njq.monitoring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 不指定泛型，默认会触发所有的事件
 */
@Component
public class SystemListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("111111" + applicationEvent.getClass().getName());
    }


}
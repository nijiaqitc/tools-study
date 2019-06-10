package com.njq.monitoring;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author: nijiaqi
 * @date: 2019/6/10
 */
@Component
public class MyEventListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("myEvent");
    }
}

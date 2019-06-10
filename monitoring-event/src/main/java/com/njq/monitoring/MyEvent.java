package com.njq.monitoring;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * @author: nijiaqi
 * @date: 2019/6/10
 */

public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
    }


}

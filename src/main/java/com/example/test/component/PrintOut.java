package com.example.test.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Develop In Action.
 * <p>
 * create by: ryugwanghyen
 * create Time : 2017-10-11
 */
@Component
public class PrintOut {

    @Value("${test.str}")
    private String str;

    @PostConstruct
    private void init(){
        System.out.println(str);
    }
}

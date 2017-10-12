package com.example.test.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Develop In Action.
 * <p>
 * create by: ryugwanghyen
 * create Time : 2017-10-11
 */
@Component
public class PrintOutByEnvironment {

    @Autowired
    private Environment env;

    @PostConstruct
    private void init(){
        System.out.println(env.getProperty("test.str"));
    }
}

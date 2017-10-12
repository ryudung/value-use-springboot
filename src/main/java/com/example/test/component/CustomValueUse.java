package com.example.test.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Develop In Action.
 * <p>
 * create by: ryugwanghyen
 * create Time : 2017-10-11
 */
@Component
public class CustomValueUse {
    @Value("#{PropertyMapInListComponent.getMapInList('${cashslide.group}')}")
    private HashMap<String, List<String>> cashslideGroup;

    @PostConstruct
    private void init(){
        cashslideGroup.entrySet().stream().forEach(mapItem ->{
            System.out.println("----------------------");
            System.out.println(mapItem.getKey()+" = ");
            mapItem.getValue().stream().forEach(item-> System.out.println(item));
            System.out.println("----------------------");
        });
    }
}

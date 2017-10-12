package com.example.test.component;

/**
 * Develop In Action.
 * <p>
 * create by: ryugwanghyen
 * create Time : 2017-10-11
 */

import com.google.common.base.Splitter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Develop In Action.
 * <p>
 * create by: ryugwanghyen
 * create Time : 2017-09-28
 * ex) cashslide.group=life:life,food,trip,culture|it:it,biz
 */
@Component("PropertyMapInListComponent")
public class PropertyMapInListComponent {
    public HashMap<String, ArrayList<String>> getMapInList(String data) {
        HashMap<String, ArrayList<String>> result = new HashMap<>();
        Splitter.on("|").omitEmptyStrings().trimResults().withKeyValueSeparator(":").split(data)
                .entrySet().stream().forEach(mapItem -> result.put(mapItem.getKey(), new ArrayList<>(Splitter.on(",").omitEmptyStrings().trimResults().splitToList(mapItem.getValue()))));
        return result;
    }
}

package com.cache.programmer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "sachin");
        map.put(2, "sehwag");
        map.put(3, "ganguly");

        map.entrySet().stream().forEach(obj -> System.out.println(obj));

        Consumer<String> consumerInterface = s -> System.out.println(s);


        List<String> strList = new ArrayList<>(map.values());
        strList.stream().filter(e -> e.startsWith("g")).forEach(System.out::println);
        map.entrySet().stream().filter(k -> k.getValue().startsWith("g")).
                forEach(k -> System.out.println(k.getKey() + "  " + k.getValue()));

    }


}

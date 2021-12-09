package com.cache.programmer;

import java.util.*;

public class SortMapDemo {


    public static void main(String[] args) {
        Map<IndianTeam, Integer> indianTeamIntegerMap = new TreeMap<>(

                (o1, o2) ->
                        o2.getRemuneration() - o1.getRemuneration()

        );
        indianTeamIntegerMap.put(new IndianTeam(7, "Sachin", 14000, 5000), 40);
        indianTeamIntegerMap.put(new IndianTeam(1, "Sehwag", 8000, 12000), 77);
        indianTeamIntegerMap.put(new IndianTeam(99, "Ganguly", 9000, 18000), 32);
        System.out.println(indianTeamIntegerMap);
        indianTeamIntegerMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(IndianTeam::getPlayerName).reversed()))
                .forEach(System.out::println);
        System.out.println("%%%%%%%%%%%%%%%%");
        indianTeamIntegerMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }

    static void usingCmpartor() {
        Map<String, Integer> map = new HashMap<>();
        map.put("sachin", 1);
        map.put("ganguly", 99);
        map.put("dravid", 11);
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("Key is: " + entry.getKey() + "  " + "value is: " + entry.getValue());
        }
    }

    static void secondApproach() {
        Map<String, Integer> map = new HashMap<>();
        map.put("sachin", 1);
        map.put("ganguly", 99);
        map.put("dravid", 11);
        //    List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
       /* Collections.sort(entries,((o1, o2) -> o1.getKey().compareTo(o2.getKey())));
        for(Map.Entry<String,Integer> entry: entries){
            System.out.println("Key is: "+ entry.getKey() + "  "+ "value is: " + entry.getValue()  );
        }*/


        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}

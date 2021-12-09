package com.cache.programmer;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        IndianTeam indianTeam = new IndianTeam(1,"gnaguly",10000,50000);
        Optional<Object> emptyVal = Optional.empty();
       // System.out.println(emptyVal);

      //  Optional<String> str =Optional.of(indianTeam.getPlayerName());
       Optional<String> str1 =Optional.ofNullable(indianTeam.getPlayerName());
     /* if(str1.isPresent()) {
          System.out.println(str1.get());
      }*/

        System.out.println(str1.orElse("default val"));
        System.out.println(str1.orElseThrow(()->new IllegalArgumentException("val not ptresrnt")));
        System.out.println(str1.map(String::toUpperCase).orElse("no value is present"));
      }
}

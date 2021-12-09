package com.cache.programmer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceDemo {

    public static void main(String[] args) {


        Predicate<String> strPred = str -> str.equalsIgnoreCase("jaggu");
        System.out.println(strPred.test("jadggu"));


        Predicate<Integer> greaterPred = i -> i > 10;
        Predicate<Integer> lessthanPred = i -> i < 20;

        System.out.println(greaterPred.and(lessthanPred).test(25));
        System.out.println(greaterPred.and(lessthanPred).test(20));

        greaterThan25(2, i -> i > 25);
        divisibleBy2(4, i -> i % 2 == 0);

        Predicate<String> startsWithJ = str->str.startsWith("J");
        Predicate<String> countLetter = str->str.length()==5;
        boolean orPredResult= startsWithJ.or(countLetter).test("hhhhh");
        System.out.println("OR Predicate Resutl: "+ orPredResult);
        boolean andPredResult= startsWithJ.and(countLetter).test("Jaggu");
        System.out.println("And Predicate Resutl: "+ andPredResult);
        boolean negatePredResult= startsWithJ.negate().test("Jaggu");
        System.out.println("And Predicate Resutl: "+ negatePredResult);

        List<String> listStrings = Arrays.asList("ABC","BCD","C");
        Predicate<String> predListTest = item->item.startsWith("J");
        listStrings.stream().filter(predListTest).forEach(e->System.out.println("found the string in the list: "+ e ));


    }

    static void greaterThan25(Integer intVal, Predicate<Integer> predFunction) {
        boolean val = predFunction.test(intVal);
        System.out.println("greaterThan25Result: " + val);

    }


    static boolean divisibleBy2(Integer intVal, Predicate<Integer> predicate) {
        boolean val = predicate.test(intVal);
        System.out.println(intVal + " is divisible by 2: " + val);
        return val;
    }







}

package com.cache.programmer;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceDemo {

    public static void main(String[] args) {
        List<Integer> list =Stream.of(1,2,13,4,5).collect(Collectors.toList());
        int result =list.stream().mapToInt(i->i).sum();
        System.out.println(result);


        int reduceSum=list.stream().reduce(0,(a,b)->a+b);
        System.out.println(reduceSum);

        Optional<Integer>sum =list.stream().reduce(Integer::sum);
        System.out.println(sum.get());

        Integer maxVal = list.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println("Max val: " +maxVal);

        double remuneration = IndianTeamDAO.getTeamRemuneration()
                .stream()
                .map(e->e.getRemuneration())
                .mapToDouble(i->i)
                .sum();
        System.out.println(remuneration);
    }
}

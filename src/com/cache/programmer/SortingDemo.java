package com.cache.programmer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {

    public static void main(String[] args) {

        List<IndianTeam> team = IndianTeamDAO.getTeamRemuneration();
        //Collections.sort(team,(t1,t2)->t2.getRemuneration()- t1.getRemuneration());
        //  System.out.println(team);

       // team.stream().sorted((t1, t2) -> t2.getRemuneration() - t1.getRemuneration())
           //     .forEach(w -> System.out.println(w));

        team.stream().sorted(Comparator.comparing(IndianTeam::getPlayerName).reversed()).forEach(System.out::println);

    }

    static void sortNumbers() {
        List<Integer> list = Arrays.asList(4, 3, 5, 7, 9);
        Collections.sort(list);
        Collections.reverse(list);
        //System.out.println(list);
        list.stream().sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
    }


}

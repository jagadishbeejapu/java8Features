package com.cache.programmer;

import java.util.List;

public class OptionalDemoExtended {
    public static void main(String[] args) {

        System.out.println(print());
    }

    static IndianTeam print(){
        List<IndianTeam> list = IndianTeamDAO.getTeamRemuneration();
     return   list.stream().filter(it->it.getPlayerName().equalsIgnoreCase("sachin"))
                .findAny().orElse(new IndianTeam(1,"dhoni",20000,100000));
    }



}

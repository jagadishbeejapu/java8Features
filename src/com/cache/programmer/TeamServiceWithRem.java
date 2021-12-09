package com.cache.programmer;

import java.util.List;
import java.util.stream.Collectors;

public class TeamServiceWithRem {
    public static  List<IndianTeam> fetchRemuneration(){
        return IndianTeamDAO.getTeamRemuneration().stream().filter(player->player.getRemuneration()>5000)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        System.out.println(TeamServiceWithRem.fetchRemuneration());
    }


}

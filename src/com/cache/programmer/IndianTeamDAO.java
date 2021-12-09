package com.cache.programmer;

import java.util.ArrayList;
import java.util.List;

public class IndianTeamDAO {

    public List<IndianTeam> getIndianTeam() {
        List<IndianTeam> team = new ArrayList<>();
        team.add(new IndianTeam(7, "Sachin", 14000));
        team.add(new IndianTeam(1, "Sehwag", 8000));
        team.add(new IndianTeam(99, "Ganguly", 9000));


        return team;
    }

    public static List<IndianTeam> getTeamRemuneration() {
        List<IndianTeam> team = new ArrayList<>();
        team.add(new IndianTeam(7, "Sachin", 14000, 5000));
        team.add(new IndianTeam(1, "Sehwag", 8000, 12000));
        team.add(new IndianTeam(99, "Ganguly", 9000, 18000));

        return team;


    }

}

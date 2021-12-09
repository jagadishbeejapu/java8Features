package com.cache.programmer;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IndianTeamService {

    public List<IndianTeam> getIndianTeamSort() {
        List<IndianTeam> indianTeam = new IndianTeamDAO().getIndianTeam();
        //approach 1
        //Collections.sort(indianTeam, new TeamComparator());
        //approach 2
       /* Collections.sort(indianTeam, new Comparator<IndianTeam>() {
            @Override
            public int compare(IndianTeam o1, IndianTeam o2) {
                return o2.getPlayerName().compareTo(o1.getPlayerName());
            }
        });*/
        //apporach 3
        Collections.sort(indianTeam,(o1,o2)->o1.getPlayerName().compareTo(o2.getPlayerName()));

        return indianTeam;
    }

    public static void main(String[] args) {
        System.out.println(new IndianTeamService().getIndianTeamSort());
    }

}

class TeamComparator implements Comparator<IndianTeam> {

    @Override
    public int compare(IndianTeam o1, IndianTeam o2) {
        return o2.getPlayerName().compareTo(o1.getPlayerName());
    }
}




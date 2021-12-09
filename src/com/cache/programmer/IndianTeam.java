package com.cache.programmer;

public class IndianTeam {
    private int jersetyNo;
    private String playerName;
    private int runsScored;
    private int remuneration;

    public IndianTeam(int jersetyNo, String playerName, int runsScored, int remuneration) {
        this.jersetyNo = jersetyNo;
        this.playerName = playerName;
        this.runsScored = runsScored;
        this.remuneration = remuneration;
    }

    public int getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(int remuneration) {
        this.remuneration = remuneration;
    }

    public IndianTeam(int jersetyNo, String playerName, int runsScored) {
        this.jersetyNo = jersetyNo;
        this.playerName = playerName;
        this.runsScored = runsScored;
    }

    public int getJersetyNo() {
        return jersetyNo;
    }

    public void setJersetyNo(int jersetyNo) {
        this.jersetyNo = jersetyNo;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    @Override
    public String toString() {
        return "IndianTeam{" +
                "jersetyNo=" + jersetyNo +
                ", playerName='" + playerName + '\'' +
                ", runsScored=" + runsScored +
                ", remuneration=" + remuneration +
                '}';
    }


}

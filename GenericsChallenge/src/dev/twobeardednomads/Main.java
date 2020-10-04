package dev.twobeardednomads;

public class Main {

    public static void main(String[] args) {

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorne");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        footballLeague.addTeam(hawthorn);
        footballLeague.addTeam(fremantle);
        footballLeague.addTeam(melbourne);
        footballLeague.addTeam(adelaideCrows);

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);

        fremantle.matchResult(melbourne, 3, 0);

        melbourne.matchResult(adelaideCrows, 6, 4);
        melbourne.matchResult(hawthorn, 1, 0);

        footballLeague.printLeague();
    }
}

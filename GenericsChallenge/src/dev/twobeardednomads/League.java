package dev.twobeardednomads;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>{
    public String name;
    private final ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addTeam(T team) {
        if (league.contains(team)) {
            System.out.println(team.getName() + " already in the League.");
        } else {
            league.add(team);
            System.out.println(team.getName() + " added to League.");
        }
    }

    public void printLeague() {
        Collections.sort(league);
        System.out.println("\nLeague Table: " + this.getName());
        System.out.println("------------------");
        for (T team : league) {
            System.out.println(team.getName() + ": " + team.ranking());
        }
    }

}

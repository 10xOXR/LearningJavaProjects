package dev.twobeardednomads;

public abstract class Player {

    private String name;

    public Player(String player) {
        this.name = player;
    }

    public String getName() {
        return name;
    }
}

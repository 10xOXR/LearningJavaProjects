package dev.twobeardednomads;

import java.util.ArrayList;
import java.util.List;

public class Players implements ISaveable {

    private final List<String> saveData = new ArrayList<>();
    private int health;
    private int ammo;

    @Override
    public void saveInfo(int health, int ammo) {

        this.health = health;
        this.ammo = ammo;
        saveData.add(toString());

    }

    @Override
    public ArrayList<String> getInfo() {

        return (ArrayList<String>) saveData;

    }

    @Override
    public String toString() {

        return "Health: " + health + "\tAmmo: " + ammo;

    }
}

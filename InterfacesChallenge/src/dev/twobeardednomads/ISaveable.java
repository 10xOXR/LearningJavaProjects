package dev.twobeardednomads;

import java.util.ArrayList;

public interface ISaveable {

    void saveInfo(int health, int Ammo);
    ArrayList<String> getInfo();
    String toString();
}

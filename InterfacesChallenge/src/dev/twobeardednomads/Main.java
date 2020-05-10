package dev.twobeardednomads;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Players players = new Players();
    private static final Monsters monsters = new Monsters();

    public static void main(String[] args) {
        //true = player
        //false = monster
        System.out.println("Enter the required player values:");
        readValues(true);
        System.out.println("-----------------------------------");
        System.out.println("Enter the required monster values:");
        readValues(false);

        System.out.println();

        System.out.println("Entered player values:");
        printValues(true);
        System.out.println("-----------------------------------");
        System.out.println("Entered monster values:");
        printValues(false);
    }

    private static void readValues(boolean playerOrMonster) {

        System.out.print("Enter input limit: ");
        int limit = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < limit; i++) {

            System.out.print("Health: ");
            int health = scanner.nextInt();
            System.out.print("Ammo: ");
            int ammo = scanner.nextInt();

            if (playerOrMonster)
                players.saveInfo(health, ammo);

            if (!playerOrMonster)
                monsters.saveInfo(health, ammo);

        }

    }

    private static void printValues(boolean playerOrMonster) {

        if (playerOrMonster)
            for (int i = 0; i < players.getInfo().size(); i++)
                System.out.println(players.getInfo().get(i));

        if (!playerOrMonster)
            for (int i = 0; i < monsters.getInfo().size(); i++)
                System.out.println(monsters.getInfo().get(i));

    }
}

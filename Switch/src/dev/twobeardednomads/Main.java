package dev.twobeardednomads;

public class Main {

    public static void main(String[] args) {
        char letter = 'D';

        switch (letter) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(letter + " was found");
                break;

            default:
                System.out.println("Not Found");
        }
    }
}

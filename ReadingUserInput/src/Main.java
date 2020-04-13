import java.time.Year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // Handle Enter key being interpreted as input for name

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = Year.now().getValue() - yearOfBirth;

            if (age >= 0 && age <= 110){
                System.out.println("Your name is " + name + ", and you are about " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth.");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }

        scanner.close();
    }
}

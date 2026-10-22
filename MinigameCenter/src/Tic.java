import java.util.Scanner;

public class Tic {
    public static void start(Scanner choice) {
        System.out.println("Hello.");
        System.out.println("Choose X or O");
        String dot = choice.nextLine();

        if (dot.equalsIgnoreCase("X")) {
            X();
        } else if (dot.equalsIgnoreCase("O")) {
            System.out.println("You chose O, so you go second!");
        } else {
            System.out.println("Invalid choice. Please enter X or O.");
        }
    }

    public static void X() {
        System.out.println("You chose X, so you go first!");
        System.out.println("Which number would you like to place your X at?");
    }

    public static void board() {
        System.out.println("1   2   3");
        System.out.println("4   5   6");
        System.out.println("7   8   9");
    }
}

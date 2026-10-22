import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner gameInput = new Scanner(System.in);
        System.out.println("Choose a game you want to play: ");
        System.out.println("1) Tic Tac Toe");
        System.out.println("2) Choose The Verity");
        String game = gameInput.nextLine();

        if (game.equalsIgnoreCase("Tic Tac Toe") || game.equalsIgnoreCase("1")) {
            Tic.start(gameInput);
        } else if (game.equalsIgnoreCase("Choose The Verity") || game.equalsIgnoreCase("2")) {
            Verity.start(gameInput);
        } else {
            System.out.println("That's not an option.");
            return;
        }
    }
}
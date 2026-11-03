import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner gameInput = new Scanner(System.in);
        System.out.println("Choose a game you want to play: ");
        System.out.println("1) Rock Paper Scissor");
        System.out.println("2) Choose The Verity");
        String game = gameInput.nextLine();

        Scanner ver = new Scanner(System.in);


        if (game.equalsIgnoreCase("Rock Paper Scissor") || game.equalsIgnoreCase("1")) {
            rps.start();
            rps.guess(gameInput);
            System.out.println("You finished the game!");


            
        } else if (game.equalsIgnoreCase("Choose The Verity") || game.equalsIgnoreCase("2")) {
            Verity.start();
            Verity.guess(ver);
            //System.out.println("You finished the game!");


        } else {
            System.out.println("That's not an option.");
            return;
        }
    }
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner gameInput = new Scanner(System.in);
        System.out.println("Choose a game you want to play: ");
        System.out.println("Choose The Verity ");
        System.out.println("Tic Tac Toe ");
        String game = gameInput.nextLine();
        if (game.equalsIgnoreCase("Tic Tac Toe")){
        Tic.start();
        }
        else if (game.equalsIgnoreCase("Choose The Verity")){
        Verity.start();
        }
        else{
        System.out.println("That's not an option.");
        return;
        }
        System.out.println("hi");
        // HEllo
    }
}
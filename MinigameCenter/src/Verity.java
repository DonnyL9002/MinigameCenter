import java.util.Scanner;

public class Verity {
    public static int roll() {
        return (int) (Math.random() * 4) + 1;
    }


    public static void start(){
        System.out.println("HI!!");
        System.out.println("You have 4 options verity, cruelty, falsity, and lovity.");
        System.out.println("Choose one of the 4 as a guess!");
        

        

    }
    public static void guess(Scanner ver){
        int playerGuess = roll();
        int ity = ver.nextInt();

        int first = roll();
        int second = roll();
        int third = roll();
        int fourth = roll();
        while (ity != first) {
            System.out.println("Try again! ")
            return;
        }


    }   
}

import java.util.Scanner;

public class rps {
    public static void start() {
        System.out.println("Hello.");
        System.out.println("Choose Rock, Paper, or Scissor");
        
        //else if (dot.equalsIgnoreCase("O")) {
            //System.out.println("You chose O, so you go second!");
        //} 
        //else {
            //System.out.println("Invalid choice. Please enter X or O.");
        //}
        
    }

    public static int roll() {
        return (int) (Math.random() * 3) + 1;
    }
        
    public static void guess(Scanner choice){
        String dot = choice.nextLine();
        
        
        
        int first = roll();

        String uno = "";
        
        if (first == 1){
            uno = "Rock";
            
            //return;
        }
        else if (first == 2){
            uno = "Paper";
            //return;
        }
        else if (first == 3){
            uno = "Scissor";
            //return;
        }
        while (!dot.equalsIgnoreCase("paper")) {
            System.out.println("Try again! ");
            dot = choice.nextLine();
        }
    }
        
}

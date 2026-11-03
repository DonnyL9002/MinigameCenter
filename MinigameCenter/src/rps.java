import java.util.Scanner;

public class rps {
    public static void start() {
        System.out.println("Hello.");
        System.out.println("Choose Rock, Paper, or Scissor");
    }

    public static int roll() {
        return (int) (Math.random() * 3) + 1;
    }
        
    public static void guess(Scanner choice){
        String dot = choice.nextLine();
        
        
        
        int first = roll();

        String uno = "";
        
        boolean truth = false;

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
        
        while (truth != true){
            if (first == 1){
                if (dot.equalsIgnoreCase("paper")){
                    System.out.println("You beat me!");
                    truth = true;
                }
                else if (dot.equalsIgnoreCase("rock")){
                    System.out.println("Tie!");
                    truth = true;
                }
                else {
                    System.out.println("Wrong! ");
                    dot = choice.nextLine();
                    truth = false;
                }
            }
            else if (first == 2){
                if (dot.equalsIgnoreCase("scissor")){
                    System.out.println("You beat me!");
                    truth = true;
                }
                else {
                    System.out.println("Try again! ");
                    dot = choice.nextLine();
                }
                
            }
            else if (first == 3){
                if (dot.equalsIgnoreCase("rock")){
                    System.out.println("You beat me!");
                truth = true;    
                }
                else {
                    System.out.println("Try again! ");
                    dot = choice.nextLine();
                }
                
            }
            
            
        }
    }
        
}

import java.util.Scanner;

public class Verity {
    // Randomizer
    public static int roll() {
        return (int) (Math.random() * 4) + 1;
    }

    //Starting out the minigame
    public static void start(){
        System.out.println("HI!!");
        System.out.println("You have 4 options verity, cruelty, falsity, and lovity.");
        System.out.println("Choose one of the 4 as a guess!");

        

    }
    //Getting user input and the whole game overall
    public static void guess(Scanner ver){
        System.out.println("What's your guess? ");
        String ity = ver.nextLine();
        //String bity = ver.nextLine();
        //String lity = ver.nextLine();
        //String city = ver.nextLine();

        int first = roll();
        
        


        //First guess
        String uno = "";
        if (first == 1){
            uno = "Verity";
            //return;
        }
        else if (first == 2){
            uno = "Cruelty";
            //return;
        }
        else if (first == 3){
            uno = "Falsity";
            //return;
        }
        else if (first == 4){
            uno = "Lovity";
            //return;
        }

        while (!ity.equalsIgnoreCase(uno)) {
            System.out.println("Try again! ");
            ity = ver.nextLine();
        }
        if (ity.equalsIgnoreCase(uno)){
            System.out.println("You got it!!!!");
        }
        
    }
}

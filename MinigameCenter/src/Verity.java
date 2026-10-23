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
        System.out.println("What's your guess? ");
        String ity = ver.nextLine();

        int first = roll();
        int second = roll();
        int third = roll();
        int four = roll();
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
        else if (four == 4){
            uno = "Lovity";
            //return;
        }
        else{
            System.out.println("Not an option");
            //return;
        }

        while (!ity.equals(uno)) {
            System.out.println("Try again! ");
            ity = ver.nextLine();
        }
        


    }   
}

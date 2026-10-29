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
        String bity = ver.nextLine();
        String lity = ver.nextLine();
        String city = ver.nextLine();

        int first = roll();
        int second = roll();
        int third = roll();
        int four = roll();


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
        else{
            System.out.println("Not an option");
            //return;
        }

        while (!ity.equalsIgnoreCase(uno)) {
            System.out.println("Try again! ");
            ity = ver.nextLine();
        }
        


        //2nd guess created
        String dos = "";
        if (second == 1){
            dos = "Verity";
            //return;
        }
        else if (second == 2){
            dos = "Cruelty";
            //return;
        }
        else if (second == 3){
            dos = "Falsity";
            //return;
        }
        else if (second == 4){
            dos = "Lovity";
            //return;
        }
        else{
            System.out.println("Not an option");
            //return;
        }
        while (!bity.equalsIgnoreCase(dos)) {
            System.out.println("Try again! ");
            bity = ver.nextLine();
        }




        //3rd guess created
        String tres = "";
        if (third == 1){
            uno = "Verity";
            //return;
        }
        else if (third == 2){
            uno = "Cruelty";
            //return;
        }
        else if (third == 3){
            uno = "Falsity";
            //return;
        }
        else if (third == 4){
            uno = "Lovity";
            //return;
        }
        else{
            System.out.println("Not an option");
            //return;
        }
        while (!lity.equalsIgnoreCase(tres)) {
            System.out.println("Try again! ");
            lity = ver.nextLine();
        }




        //fourth guess created
        String cuatro = "";
        if (four == 1){
            uno = "Verity";
            //return;
        }
        else if (four == 2){
            uno = "Cruelty";
            //return;
        }
        else if (four == 3){
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
        while (!city.equalsIgnoreCase(cuatro)) {
            System.out.println("Try again! ");
            city = ver.nextLine();
        }


    }   
}

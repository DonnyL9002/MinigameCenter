import java.util.Scanner;

public class Verity {
    // Randomizer
    public static int roll() {
        return (int) (Math.random() * 4) + 1;
    }
    public static int roller() {
        return (int) (Math.random() * 26) + 1;
    }
    //Starting out the minigame
    public static void start(){
        System.out.println("HI!!");
        System.out.println("You have 4 options verity, cruelty, falsity, and lovity.");
        System.out.println("Choose one of the 4 as a guess!");

        

    }
    
    //Getting user input and the whole game overall
    public static void guess(Scanner ver){
        System.out.println("What's your first guess? ");
        String ity = ver.nextLine();
        //String bity = ver.nextLine();
        //String lity = ver.nextLine();
        //String city = ver.nextLine();

        int first = roll();
        
        


        //First guess
        String uno = "";
        if (first == 1){
            uno = "verity";
            //return;
        }
        else if (first == 2){
            uno = "cruelty";
            //return;
        }
        else if (first == 3){
            uno = "falsity";
            //return;
        }
        else if (first == 4){
            uno = "lovity";
            //return;2
        }

        


        while (!ity.equalsIgnoreCase(uno)) {
            System.out.println("Try again! ");
            ity = ver.nextLine();
        }
        if (ity.equalsIgnoreCase(uno)){
            System.out.println("You got it!!!!");
        }
        
        int second = roller();
        

        System.out.println("How many letters do you have in your word? ");
        String dude = "";
        if (second == 1){
            dude = "a";
        }
        else if (second == 2){
            dude = "B";
        }
        else if (second == 3){
            dude = "c";
        }
        else if (second == 4){
            dude = "d";
        }
        else if (second == 5){
            dude = "e";
        }
        else if (second == 6){
            dude = "f";
        }
        else if (second == 7){
            dude = "g";
        }
        else if (second == 8){
            dude = "h";
        }
        else if (second == 9){
            dude = "i";
        }
        else if (second == 10){
            dude = "j";
        }
        else if (second == 11){
            dude = "k";
        }
        else if (second == 12){
            dude = "l";
        }
        else if (second == 13){
            dude = "m";
        }
        else if (second == 14){
            dude = "n";
        }
        else if (second == 15){
            dude = "o";
        }
        else if (second == 16){
            dude = "p";
        }
        else if (second == 17){
            dude = "q";
        }
        else if (second == 18){
            dude = "r";
        }
        else if (second == 19){
            dude = "s";
        }
        else if (second == 20){
            dude = "t";
        }
        else if (second == 21){
            dude = "u";
        }
        else if (second == 22){
            dude = "v";
        }
        else if (second == 23){
            dude = "w";
        }
        else if (second == 24){
            dude = "x";
        }
        else if (second == 25){
            dude = "y";
        }
        else if (second == 26){
            dude = "z";
        }
        System.out.println("If you take out " + second + " (" + dude +  ") then it will be.");
        uno = removeAll(uno, dude);
        System.out.println(uno);


    
    }
    public static String removeAll(String text, String letter) {
    String result = "";
    for (int i = 0; i < text.length(); i++) {
        String piece = text.substring(i, i + 1);
        if (!piece.equals(letter)) {
            result += piece;
        }
    }
    return result;
}

}

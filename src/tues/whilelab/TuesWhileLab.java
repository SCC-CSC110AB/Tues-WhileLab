package tues.whilelab;

import java.util.Scanner;

/**
 *
 * @author john
 */
public class TuesWhileLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isUserFinished = true;
        Scanner keyboard = new Scanner(System.in);
        String userInput = "Q";
                
        while(!isUserFinished) {
            System.out.println("Hi! What animal do you like?");
            System.out.println("A.\tDog");
            System.out.println("B.\tCow");
            System.out.println("C.\tCat");
            System.out.println("Q.\tQuit");
            
            userInput = keyboard.nextLine();
            
            if (userInput.equalsIgnoreCase("a")) {
                System.out.println("Woof woof!!");
            } else if (userInput.equalsIgnoreCase("b")) {
                System.out.println("Moooooooo");
            } else if (userInput.equalsIgnoreCase("c")) {
                System.out.println("Meow. Purr.");
            } else if (userInput.equalsIgnoreCase("q")) {
                isUserFinished = true;
            } else {
                System.out.println("You didn't answer the question!!");
            }
        }
    }
    
}

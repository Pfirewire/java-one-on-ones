package samRamos;

import java.util.Scanner;

public class SamRamos {

    final private static Scanner scan = new Scanner(System.in);

    public static int getInteger(int min, int max) {
        do {
            // Tell the user to do something
            // Enter a number between the min and max values passed in
            System.out.printf("Enter a number between %s and %s%n", min, max);
            // Use the Scanner class to get the user's number
            // Store it in a variable
            String userInput = scan.nextLine();
            try {
                // validate that the user input is able to be converted to an int
                // Turn user's input into an int
                int userInt = Integer.parseInt(userInput);// Check to see if it is between our min and max parameters
                if (userInt >= min && userInt <= max) {
                    // If so
                    // Return the user's input
                    return userInt;
                }
                // If not
                // Tell the user they suck
                // Do it all again from the beginning
            } catch(NumberFormatException e) {
                System.out.println("This needs to be a whole number");
            }

        } while(true);
    }

    public static int getIntegerRecursive(int min, int max) {
        System.out.printf("Enter number between %s and %s%n", min, max);
        String userInput = scan.nextLine();
        try {
            int userInt = Integer.parseInt(userInput);
            if (userInt >= min && userInt <= max) {
                return userInt;
            }
        } catch(NumberFormatException e) {
            System.out.println("you suck");
        }
        return getIntegerRecursive(min, max);
    }

    public static void main(String[] args) {
        // We need SOMETHING in main, but pretty much everything else can be extracted elsewhere
        System.out.println("You entered " + getIntegerRecursive(1, 10));
    }
}

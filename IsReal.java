// A program that allows user to select menu item in performing several operations 
// E.g Choose a print menu  1. testing for odd/even number   2. testing for prime number
//     3. Exit the program  4. Print menu option    5. Clear result screen

// Program uses scanner;
import java.util.Scanner;
//Scanner is a java predefine function used to accept input from the user

public class IsReal {  // declaring class name

    static String odd(int x) { //declaring function/method for checking odd/even numbers
        System.out.println(" Almost done, now conducting odd/even property test on " + x);
        String result1 = " is odd";
        String result2 = " is even";
        boolean isOdd = true;
        if (x % 2 == 0) {  // testing statement/conditional statement
            isOdd = false;
        }
        if (isOdd) {
            return result1; // returning false value
        } else {
            return result2;// returning true value
        }
    }

    public static void printMenu() { // declaring method printmenu
        System.out.println("1. Test Odd/Even property\n2. Test prime property"); // menu items
        System.out.println("3. Exit the program\n4. Print menu\n5. Clear Screen");// menu items
    }

    public static int fetchNextNumber(String prompt, Scanner in) { // declaring method to accept number from the user
        System.out.print(prompt); // collecting variable from user
        return in.nextInt();
    }

    public static boolean checkPrime(int number) { // declaring method to check if a number is prime 
        boolean isPrime = true;
        System.out.println("check the number out ");

        if (number < 2) { // 0 and 1 are not prime numbers
            return false;
        }

        for (int i = 2; i < number; i++) { // loop statement
            if (number % i == 0) {
                isPrime = false; // the number is not a prime if remainder is 0
            }
        }

        return isPrime; // if remainder is not zero, return true ie. is prime
    }

    public static void main(String[] args) { // declaring main method to begin program execution
        int x; // value to be declared by the usser
        printMenu(); // list the menu item options
        Scanner input = new Scanner(System.in); // create scanner to obtain input from command window
        String prompt1 = "Select menu item : "; // asking user to select operation
        String prompt2 = "Enter number "; // promp value from user

        boolean runProgram = true; // prompt user to select menu option again after executing the
        // first menu selected by the user

        while (runProgram) {
            x = fetchNextNumber(prompt1, input); // the number entered by the user
            if (x == 1) {
                // testing for odd/even
                int number = fetchNextNumber(prompt2, input);
                String result = odd(number); // calling function odd
                System.out.println(" I noticed that " + number + result); // output the result(odd or even)
            } else if (x == 2) {
                // testing for prime
                int number = fetchNextNumber(prompt2, input);
                if (checkPrime(number)) {
                    System.out.println(number + " is prime");
                } else {
                    System.out.println(number + " is not prime");
                }
            } else if (x == 3) {
                //do quit
                System.out.println("Bye Bye!");
                runProgram = false; // terminate menu option selection request after execution
            } else if (x == 4) {
                // show menu option
                printMenu();
            } else if (x == 5) {
                //clear screen
                for (int i = 0; i < 1; i++) {
                    System.out.println("\n");
                }
            } else if (x > 5) {
                // invalid menu option
                System.out.println("Wrong menu selection, please choose printMenu to see valid options. Press 4 to choose PrintMenu");
            }
        }
    }
}

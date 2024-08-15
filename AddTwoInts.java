// This is a comment
/*
*Juan Miguel Jimenez
*8/15/24
* AddTwoInts.java
 */
import java.util.Scanner; // Import the scanner class

public class AddTwoInts {
    public static void main(String[] args) {
        System.out.println("\nWelcome to the Double Int Program");

        int firstNum = 0;
        int secondNum = 0;
        int sumOfTwoNumbers = 0;

        System.out.println("\n The value of sumOfTwoNumbers is: " + sumOfTwoNumbers);
        // Create a scanner object
        Scanner myScannerObject = new Scanner(System.in);
        // Ask user for the first int
        System.out.println("\n Enter whole number: ");
        firstNum = myScannerObject.nextInt();

        // unit test for out 1st user input
        System.out.println("\n The value of first number is: " + firstNum);

        // Ask user for the second int
        System.out.println("\n Enter 2nd whole number: ");
        secondNum = myScannerObject.nextInt();

        // Unit test for second number
        System.out.println("\n The value of second number is: " + secondNum);

        // Processing
        // Add the two ints input from the user.
        // the total of firstNum and secondNum
        // will be stored in the variable named sumTwoNumbers

        sumOfTwoNumbers = firstNum + secondNum;

        // Output the value of the variable named: sumOfTwoNumbers
        System.out.println("\n The sum of two numbers is: " + sumOfTwoNumbers);
    }
}


import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

            System.out.println("\n\n Welcome to the Largest of Three! \n\n");


        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        int LargestOfThree = 0;

    // Create a Scanner object
    Scanner myScannerObject = new Scanner(System.in);
    // enter 1st num
    System.out.print("Enter first number: ");
    firstNum = myScannerObject.nextInt();
    //enter second num
    System.out.print("Enter second number: ");
    secondNum = myScannerObject.nextInt();
    // enter third num
    System.out.print("Enter third number: ");
    thirdNum = myScannerObject.nextInt();

    // processing:
        //compare inputs with nested if statements.
        if (firstNum > secondNum && firstNum > thirdNum) {
            LargestOfThree = firstNum;
        } else if (secondNum > firstNum && secondNum > thirdNum) {
            LargestOfThree = secondNum;
        } else if (thirdNum > firstNum && thirdNum > secondNum) {
            LargestOfThree = thirdNum;
        }
        System.out.println("The largest of three numbers is " + LargestOfThree);
    }
}

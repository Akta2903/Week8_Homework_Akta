package week8_homework;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum  and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum  number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class MinAndMaxInputChallenge {
    public static void main(String[] args) {        //main method
        Scanner scanner = new Scanner(System.in);       //scanner use
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {                                    //logic for MinMax
            System.out.println("Enter number: ");       //print statement
            if (scanner.hasNextInt()) {                  //if condition
                int number = scanner.nextInt();
                if (number < min) {                       //if else condition
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Minimum number entered: " + min);           //print statement
        System.out.println("Maximum number entered: " + max);
        scanner.close(); // scanner closing
    }

}
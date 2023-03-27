package week8_homework;
/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those  numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read  10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the  count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number  #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) // declaring the main method
    {
        ReadingUserInputChallenge obj = new ReadingUserInputChallenge(); // creating an object
        obj.readInput(); // calling an instance method
    }

    public void readInput() // declaring an instance method
    {
        int counter = 1; // declaring and intiLISING a variable
        int sum = 0;
        // int number;

        Scanner scan = new Scanner(System.in); // to read the input from the console
        // logic to sum the put number
        while (counter <= 10) {
            System.out.print("Enter number #" + counter + ":");
            boolean checkNumber = scan.hasNextInt(); // to check whether the input value is number or not

            if (checkNumber == true) {

                int number = scan.nextInt(); // execute the if the user enters the valid input
                sum = sum + number;
                counter++;
            } else {
                System.out.println("Enter valid number"); // out put if the condition is false
            }
            scan.nextLine(); // allows to input the number again

        }
        System.out.println("Sum of 10 numbers: " + sum); // output the sum of the input numbers
        scan.close();
    }

}

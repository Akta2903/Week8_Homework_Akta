package week8_homework;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */

public class Program12_PrimeNumber {
    public static void main(String[] args) // declaring main method
    {
        Scanner scan = new Scanner(System.in); // to read the input from the console
        System.out.println("Enter the number : ");
        int number = scan.nextInt(); // takes the input
        scan.close(); // scanner closing
        Program12_PrimeNumber obj = new Program12_PrimeNumber(); // object creation to call an instance method
        obj.isPrimeOrNot(number); // calling Instance method
    }

    public void isPrimeOrNot(int number) // instance method declaration
    {
        boolean prime = false;
        // logic to check whether the number is prime or not
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                prime = true;
                break;
            }
        }
        if (!prime) {
            System.out.println(number + " is a Prime number"); // output if the number is prime
        } else {
            System.out.println(number + " is not a Prime number"); // output if the number is not prime
        }

    }

}

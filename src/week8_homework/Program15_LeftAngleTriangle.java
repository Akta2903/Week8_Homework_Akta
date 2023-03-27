package week8_homework;

import java.util.Scanner;

/**
 * 15. Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class Program15_LeftAngleTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // to read the input from the console
        System.out.println("Enter the number of rows you want to display : ");
        int number = scan.nextInt(); // allows to take the input
        leftAngleTriangle(number); // calling static method
        scan.close(); // closing the scanner
    }

    public static void leftAngleTriangle(int n) // declaring static method
    {
        // logic to print the triangle
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // output
            }
            System.out.println(" ");
        }
    }
}

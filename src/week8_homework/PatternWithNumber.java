package week8_homework;

import java.util.Scanner;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.   For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */

public class PatternWithNumber {
    public static void main(String[] args) // declaring main method
    {
        PatternWithNumber obj = new PatternWithNumber(); // creating an object to call instance method
        obj.triangleWithNumber(); // calling instance method

    }

    public void triangleWithNumber()  // declaring instance method
    {
        Scanner scan = new Scanner(System.in); //to read the output from the console
        System.out.println("Enter the number of rows : ");
        int n = scan.nextInt(); // input
        // logic to print the numbers in triangle form
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j); // output

            }
            System.out.println(" ");
        }
        scan.close();
    }
}

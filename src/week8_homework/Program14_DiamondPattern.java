package week8_homework;

import java.util.Scanner;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */

public class Program14_DiamondPattern {
    public static void main(String[] args) // declaring main method
    {
        Scanner scan = new Scanner(System.in); // to read the input from the console
        System.out.print("Enter number : ");
        int n = scan.nextInt(); // to take the input
        diamond(n); // calling static method
        scan.close(); // closing scanner
    }

    public static void diamond(int n) // declaring static method
    {
        // logic to print the triangle
        int i = 1;
        int k, j;
        while (i <= n) {
            k = 1;
            while (k <= n - i) {
                System.out.print(" ");
                k++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        i = n - 1;
        while (i > 0) {
            k = n;
            while (k > i) {
                System.out.print(" ");
                k--;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;

        }
    }
}
package week8_homework;

import java.util.Scanner;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Program9_FibonacciNumber {
    public static void main(String[] args) // declaring main method
    {
        Scanner scan = new Scanner(System.in); //Scanner object creation to read the input from the console
        System.out.println("Enter the number : ");
        int n = scan.nextInt(); // takes the input
        Program9_FibonacciNumber obj = new Program9_FibonacciNumber(); // object created to call the instance method
        obj.fibonacciNumber(n); // calling instance method
        scan.close(); // scanner closing

    }

    public void fibonacciNumber(int number) // declaring instance method
    {
        int n1 = 0; // variable declaration and initialisation
        int n2 = 1, n3;
        //int i=1;
        System.out.print("The Fibonacci series for upto " + number + " number is :  ");
        System.out.print(n2);
        // logic to print the fibonacci series
        for (int i = 1; i <= number; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3); // output
            n1 = n2;
            n2 = n3;


        }

    }
}

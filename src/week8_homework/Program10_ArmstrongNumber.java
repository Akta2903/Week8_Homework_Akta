package week8_homework;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class Program10_ArmstrongNumber {
    public static void main(String[] args) // declaring main method
    {
        Scanner scan = new Scanner(System.in); // t read the input from the console
        System.out.print("Enter the number :  ");
        int number = scan.nextInt(); // allows to take the input
        Program10_ArmstrongNumber obj = new Program10_ArmstrongNumber(); // object creation to call an instance method
        obj.isArmstrong(number); // calling an instance method
        scan.close(); // scanner closing

    }

    public void isArmstrong(int number) // declaring an instance method
    {
        int number1 = number;  // vaiable declaration and initialisation

        int lastDigit;
        int result = 0;
        // logic to check whether the number is armstrong or not
        while (number1 > 0) {
            lastDigit = number1 % 10;
            result += Math.pow(lastDigit, 3);
            number1 = number1 / 10;

        }
        if (result == number) {
            System.out.println("The Number " + number + " is an Armstrong Number : "); // output if number is armstrong number
        } else {
            System.out.println("The Number " + number + " is not an Armstrong Number : "); // output if number is not armstrong number
        }
    }

}

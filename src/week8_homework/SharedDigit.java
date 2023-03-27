package week8_homework;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not  within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;  otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers NOTE: The method hasSharedDigit should be defined as public static
 */

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 22)); // calling static method
        System.out.println(hasSharedDigit(23, 40)); // calling static method
        System.out.println(hasSharedDigit(9, 99)); // calling static method
        System.out.println(hasSharedDigit(234, 40)); // calling static method
        System.out.println(hasSharedDigit(-50, 55)); // calling static method


    }

    public static boolean hasSharedDigit(int number1, int number2) // declaring static method
    {
        // int firstNumber1,firstNumber2,lastNumber1,lastNumber2;
        if (number1 >= 10 && number1 <= 99 && number2 >= 10 && number2 <= 99) {
            if (number1 % 10 == number2 % 10 || number1 / 10 == number2 / 10) {
                System.out.print("Has shared digit since :"); // output if the condition is true
                return true;
            } else {
                System.out.print("Has not any  shared digit since :"); //output if the condition is false
                return false;
            }
        }
        System.out.print("Invalid input since : "); // invlaid input
        return false;
    }
}

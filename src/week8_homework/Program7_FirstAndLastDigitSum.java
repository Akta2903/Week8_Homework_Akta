package week8_homework;

/**
 * 7. First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 * <p>
 * Example input/output
 * * sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 * * sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
 * * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
 * <p>
 * gives us 0+0 and the sum is 0.
 * <p>
 * * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
 * gives us 5+5 and the sum is 10.
 * * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 * NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 */

public class Program7_FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(12345)); // calling  static method
        System.out.println(sumFirstAndLastDigit(567)); // calling  static method
        System.out.println(sumFirstAndLastDigit(-12345)); // calling  static method
        System.out.println(sumFirstAndLastDigit(5)); // calling  static method
        System.out.println(sumFirstAndLastDigit(0)); // calling  static method

    }

    public static int sumFirstAndLastDigit(int number) // declaring static method
    {
        int firstDigit = number; // declaring and initialising the variable
        int lastDigit = 0; // declaring and initialising the variable
        // logic to sum the first and last digit of the given number
        if (number >= 0) {
            lastDigit = number % 10; // extract the last digit from the number
            while (firstDigit > 10) {

                firstDigit = firstDigit / 10; // find the first digit of the number


            }
            //output
            System.out.print("The sum of first digit " + firstDigit + " and last digit " + lastDigit + " of number " + number + " is :  ");
            return firstDigit + lastDigit;
        } else {
            System.out.print("Invalid input since return : "); //output if the input is invalid
            return -1;
        }

    }

}

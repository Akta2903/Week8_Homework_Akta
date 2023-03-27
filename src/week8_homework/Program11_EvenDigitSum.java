package week8_homework;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.  The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.  EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */

public class Program11_EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(256)); // calling static method
        System.out.println(getEvenDigitSum(1236548)); // calling static method
        System.out.println(getEvenDigitSum(-123)); // calling static method
        System.out.println(getEvenDigitSum(0)); // calling static method
    }

    public static int getEvenDigitSum(int number)  //declaring static method
    {

        int sum = 0; // variable declaration and initialisation
        int lastDigit;
        // logic to sum the even digit of a number
        if (number > 0) {
            while (number != 0) {
                lastDigit = number % 10;

                if (lastDigit % 2 == 0) {
                    sum = sum + lastDigit;
                }
                number = number / 10;

            }
            System.out.print(("The sum of even digits are : "));
            return sum;
        }
        System.out.print("Invalid input since returns : ");
        return -1;
    }
}
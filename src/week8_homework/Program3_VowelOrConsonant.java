package week8_homework;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

public class Program3_VowelOrConsonant {
    public static void main(String[] args) // main method declaration
    {

        Program3_VowelOrConsonant obj = new Program3_VowelOrConsonant(); // object creation to call the instance method
        obj.vowelOrConsonant(); //calling instance method


    }

    public void vowelOrConsonant() // declaring instance method
    {
        Scanner scan = new Scanner(System.in); // to read the input from the console
        System.out.println("Enter an alphabet : ");
        String alphabet = scan.next(); // input
        //logic
        if ((alphabet.length() == 1) && Character.isAlphabetic(alphabet.charAt(0))) {
            if (alphabet.equals("a") || alphabet.equals("A") || alphabet.equals("e") || alphabet.equals("E") || alphabet.equals("i") || alphabet.equals("I") || alphabet.equals("o") || alphabet.equals("O") || alphabet.equals("u") || alphabet.equals("U")) {
                System.out.println(alphabet + " is a Vowel");
            } else {
                System.out.println(alphabet + " is a consonant");
            }
        } else {
            System.out.println("Invalid input");
        }
        scan.close(); // scanner closing
    }
}
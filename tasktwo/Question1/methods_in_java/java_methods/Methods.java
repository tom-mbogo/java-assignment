package Question1.methods_in_java.java_methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        // my variables
        double num_1, num_2, num_3, smallestNumber, largestNumber;

        // scanner object
        Scanner input = new Scanner(System.in);

        // getting input
        System.out.println("\nEnter the first number: ");
        num_1 = input.nextInt(); // input first number
        System.out.println("Enter the second number: ");
        num_2 = input.nextInt(); // input second number
        System.out.println("Enter the third number: ");
        num_3 = input.nextInt(); // input third number

        //get return values fom the methods
        smallestNumber = findSmallestNumber(num_1, num_2, num_3);
        largestNumber = findLargestNumber(num_1, num_2, num_3);

        // output 
        System.out.println("\nThe smallest number: " + smallestNumber);
        System.out.println("The largest number: " + largestNumber);
        System.out.println(largestNumber + " is your largest and " + smallestNumber + " is the smallest number.");
    }

    // this static method will find the smallest num
    static double findSmallestNumber(double firstNumber, double secondNumber, double thirdNumber) {

        // get smallest number
        if (firstNumber < secondNumber) {
            // if true, is firstNumber > thirdNumber
            if (firstNumber < thirdNumber) {
                // if true, return firstNumber
                return firstNumber;
            } else {
                // else false, return thirdNumber
                return thirdNumber;
            }
        } else {
            // else false, is secondNumber < thirdNumber
            if (secondNumber < thirdNumber) {
                // if true, return secondNumber
                return secondNumber;
            } else {
                // else false, return thirdNumber
                return thirdNumber;
            }
        }
    }

    // this static method will find the largest num
    static double findLargestNumber(double firstNumber, double secondNumber, double thirdNumber) {

        // get largest number
        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                // if true, return firstNumber
                return firstNumber;
            } else {
                // else false, return thirdNumber
                return thirdNumber;
            }
        } else {
            if (secondNumber > thirdNumber) {
                // if true, return secondNumber
                return secondNumber;
            } else {
                // else false, return thirdNumber
                return thirdNumber;
            }
        }
    }
}

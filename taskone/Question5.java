package taskone;

import java.util.Scanner; //importing Scanner

public class Question5 {
    public static void main(String[] args) {

        // my variables
        Double num1;
        Double  num2;
        Double  result;
        char mathSign;

        Scanner data = new Scanner(System.in); //Scanner object

        // request the first number from the user
        System.out.println("Enter the first number");
        num1 = data.nextDouble();

        // request the the mathSign from the user
        System.out.println("Type one of these signs as your operator: +, -, *, or /");
        mathSign = data.next().charAt(0);

        // request the second number from the user
        System.out.println("Enter second number");
        num2 = data.nextDouble();

        switch (mathSign) {

            // perform subtraction
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            // perform addition
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            // perform multiplication
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            // perform division
            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            default:
                System.out.println("Please try again.");
                break;
        }
    }
}
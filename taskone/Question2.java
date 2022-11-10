package taskone;

import java.util.Scanner;

public class Question2 {
    
    //main function
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            
        //my variables
        double unitOne, unitTwo, unitThree, unitFour, unitFive, average;
        
            System.out.println("Enter marks of the five units you did on last semester.");
            //inputting the user data
            System.out.println("\nUnit 1 : ");
            unitOne = input.nextDouble();
            System.out.println("Unit 2 : ");
            unitTwo = input.nextDouble();
            System.out.println("Unit 3 : ");
            unitThree = input.nextDouble();
            System.out.println("Unit 4 : ");
            unitFour = input.nextDouble();
            System.out.println("Unit 5 : ");
            unitFive = input.nextDouble();

            //getting average mark by calling findAverage() and putting it in a variable
            average = findAverage(unitOne, unitTwo, unitThree, unitFour, unitFive);

            //Outputting the [average]
            System.out.println("\nAverage mark : " + average);
        }

    static double findAverage(double unit1, double unit2, double unit3, double unit4, double unit5) {
        //finding the average
        var myAverage = (unit1 + unit2 + unit3 + unit4 + unit5) / 5; 
        //rounding the average
        var roundedAverage = Math.round(myAverage * 100.0) / 100.0; 
        return roundedAverage;
    }
}

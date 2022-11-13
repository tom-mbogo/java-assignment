package Question2;

import java.util.Scanner;

public class GenerateAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double marksForJava, marksForNetworking, marksForMath, averageMark; // my variables

        // input marks
        System.out.println("Enter marks for Java Programming: ");
        marksForJava = input.nextInt(); // get marksForJava marks
        System.out.println("Enter marks for marksForNetworking: ");
        marksForNetworking = input.nextInt(); // get marksForNetworking marks        
        System.out.println("Enter marks for Maths: ");
        marksForMath = input.nextInt(); // get maths marks
        
        // Getting the averageMark
        averageMark = (marksForJava + marksForNetworking + marksForMath) / 3; 

        // output your data
        System.out.println("\nMarks for Java Programming is: " + marksForJava);
        System.out.println("Marks for marksForNetworking: " + marksForNetworking);
        System.out.println("Marks for Maths: " + marksForMath);

        // output the averageMark
        System.out.println("\nThe averageMark is: " + averageMark);
    }

}

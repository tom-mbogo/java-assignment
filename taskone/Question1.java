package taskone;

import java.util.Scanner;

public class Question1 {

    // Start
    public static void main(String[] args) {

        // scanner object
        Scanner input = new Scanner(System.in);
        
        //My variables
        String userSirName;
        int userAge;
        int userSirNameSize;
        String isOddorEven;

        //collecting data
        System.out.println("Please enter your sir name :");
        userSirName = input.nextLine();
        System.out.println("Enter your userAge :");
        userAge = input.nextInt();

        //.length() will give number of letters
        userSirNameSize = userSirName.length(); 

        //Checking if userAge is even or odd
        if (userAge % 2 == 0) {
            isOddorEven = "even";
        } else {
            isOddorEven = "odd";
        }

        //Displaying output
        System.out.println("The number of characters in your sir name is : " + userSirNameSize);
        System.out.println("Your current userAge is an " + isOddorEven + " number.");
    }
}

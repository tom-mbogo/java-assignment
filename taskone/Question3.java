package taskone;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        //getting input
        System.out.println("This program checks if numbers are divisibile by zero to 9. Enter any number :");
        int myInteger;
        myInteger = input.nextInt();

        //using methods in main activity
        Zero(myInteger);
        One(myInteger);
        Two(myInteger);
        Three(myInteger);
        Four(myInteger);
        Five(myInteger);
        Six(myInteger);
        Seven(myInteger);
        Eight(myInteger);
        Nine(myInteger);
    }

    //to test 0
    static void Zero(int data_argument) {
        System.out.println(data_argument + " can't be divisible by 0.");
    }

    //to test 1
    static void One(int data_argument) {
        System.out.println(data_argument + " is divisible by 1.");
    }

    //to test 2
    static void Two(int data_argument) {
        if (data_argument % 2 == 0) {
            System.out.println(data_argument + " is divisible by 2.");
        } else {
            System.out.println(data_argument + " is not divisible by 2.");
        }
    }

    //to test 3
    static void Three(int data_argument) {
        if ((data_argument % 3) == 0) {
            System.out.println(data_argument + " is divisible by 3");
        } else {
            System.out.println(data_argument + " is not divisible by 3");
        }
    }

    //to test 4
    static void Four(int data_argument) {
        if ((data_argument % 4) == 0) {
            System.out.println(data_argument + " is divisible by 4");
        } else {
            System.out.println(data_argument + " is not divisible by 4");
        }
    }

    //to test 5
    static void Five(int data_argument) {
    if ((data_argument % 5) == 0) {
            System.out.println(data_argument + " is divisible by 5");
        } else {
            System.out.println(data_argument + " is not divisible by 5");
        }
    }

    //to test 6
    static void Six(int data_argument) {
        if ((data_argument % 6) == 0) {
            System.out.println(data_argument + " is divisible by 6");
        } else {
            System.out.println(data_argument + " is not divisible by 6");
        }
    }

    //to test 7
    static void Seven(int data_argument) {
        if ((data_argument % 7) == 0) {
            System.out.println(data_argument + " is divisible by 7");
        } else {
            System.out.println(data_argument + " is not divisible by 7");
        }
    }

    //to test 8
    static void Eight(int data_argument) {
        if ((data_argument % 8) == 0) {
            System.out.println(data_argument + " is divisible by 8");
        } else {
            System.out.println(data_argument + " is not divisible by 8");
        }
    }

    //to test 9
    static void Nine(int data_argument) {
        if ((data_argument % 9) == 0) {
            System.out.println(data_argument + " is divisible by 9");
        } else {
            System.out.println(data_argument + " is not divisible by 9");
        }
    }
}

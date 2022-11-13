package Question3.shapes.triangle;

// importing scanner
import java.util.Scanner;

public class TriangleArea {

    static double triangleBase, triangleHeight, area;

    // input the base and the height
    void baseHeight() {

        // scanner object
        Scanner input = new Scanner(System.in);
        // get inputs
        System.out.println("Enter the base of the triangle: ");
        triangleBase = input.nextDouble(); // store the input in triangleBase

        System.out.println("Enter the height of the triangle: ");
        triangleHeight = input.nextDouble(); // store the input in triangleHeight

    }

    // find the area of the rectangle
    void findArea() {

        area = 0.5 * triangleBase * triangleHeight;
    }

    // method to output area
    void outpuResults() {

        // output the area
        System.out.println("The area of our triangle is: " + area);
    }

    // main method
    public static void main(String[] args) {

        // calling the non-static in a static main method
        TriangleArea myClass = new TriangleArea();
        myClass.baseHeight();
        myClass.findArea();
        myClass.outpuResults();
    }
}

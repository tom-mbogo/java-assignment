package taskone;

//imports
import java.util.stream.Collectors; //Collectors
import java.util.List;              //List
import java.util.stream.IntStream;  //IntStream

public class Question4 {

    public static void main(String[] args) {
        
        //the list of numbers from 71 to 150
        List<Integer> myList;
        myList = IntStream.range(71, 150).boxed().collect(Collectors.toList());
        myList.add(150); //adding 150 to the list

        //Multiples of 2:
        System.out.println("These are multiples of 2 :");
        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                System.out.println(myList.get(i));
            }
            
            if (i == 150-71) {
                break;
            } 
        }
        System.out.println("\n");

        System.out.println("These are multiples of 3 :");
        //these are the multiples of 3
        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 3 == 0) {
                System.out.println(myList.get(i));
            }
            
            if (i == 150-71) {
                break;
            } 
        }
        System.out.println("\n"); //my empty line
        
        //Multiples of 7:
        System.out.println("These are multiples of 7 :");
        //these are the multiples of 7
        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 7 == 0) {
                System.out.println(myList.get(i));
            }
            
            if (i == 150-71) {
                break;
            } 
        }

    }
}

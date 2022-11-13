package Question4;

public class Question4 {

    // non static method
    void printGreeting(String wordA, String sentence_two) {
        System.out.println(wordA + sentence_two);
    }

    // main method
    public static void main(String[] args) {

        String sentence_one, sentence_two;
        // calling a static method
        sentence_one = "I am typing ";
        sentence_two = findWord2();

        // using non-static method
        Question4 myClass = new Question4();
        myClass.printGreeting(sentence_one, sentence_two);
    }

    // static method
    static String findWord2() {
        String wordTwo = "Java code.";
        return wordTwo;
    }

}
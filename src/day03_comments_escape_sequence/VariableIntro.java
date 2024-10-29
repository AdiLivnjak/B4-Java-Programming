package day03_comments_escape_sequence;

import java.sql.SQLOutput;

public class VariableIntro {

    public static void main(String[] args) {

       // Option 1
        int num1; // DECLARED VARIABLE called num1 and int data type [NOTE: for declaration you need data type]
        num1 = 6;  //ASSIGNED VALUE/DATA into variable.
        System.out.println(4);
        System.out.println(num1);

        //int num1; // In one/same method, we CANNOT declare SAME VARIABLE NAME more than ONCE - it will not compile
        num1 = 10; // RE-ASSIGNMENT - I gave another value to already declared variable
        System.out.println(num1);

        // num2 = 50; // you cannot declare ONLY variable name without Data type



        // Option 2
        int num2 = 33; // DECLARED VARIABLE and ASSIGNED VALUE/DATA in one statement
        System.out.println(num2);
        System.out.println(20);
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num2);
        num2 = 40;
        System.out.println(num2);
        System.out.println(90);


        System.out.println(4);
        byte n1 = 4;
        short n2 = 4;
        int n3 = 4;
        long n4 = 4;
        long n5 = 8000000000L;

        //--------------------------------------------------------------------

        System.out.println("--------------------------------------------");

        System.out.println(4.5); // By default it is double

        float d1 = 3.6F;
        double d2 = 3.6;
        System.out.println(d1);
        System.out.println(d2);

        System.out.println("--------------------------------------------");


        char letter1;
        //letter1 = 'a'; // In single quote, we cannot use more than ONE character.
        letter1 = 'a';
        System.out.println(letter1);
        String letter2 = "aa";
        String letter3 = "aa";
        char letter4 = '$';
        System.out.println(letter4);

        System.out.println("--------------------------------------------");
        boolean varName = true;
        System.out.println(varName);
        varName = false;
        System.out.println(varName);
        //varName = correct;  // It only can hold either true or false
        //varName = 12;  // It only can hold either true or false
        //varName 'A'; // It only can hold either true or false

        System.out.println("--------------------------------------------");
        // Sample Strings
        String word = "Apple"; // Here --> I declared String variable and assigned "Apple" value to it.
        System.out.println(word);
        System.out.println("Apple"); // Here --> I printed out a String value directly.
        String sentence = "Today we covered basics and fundamentals for Java Data Types";
        System.out.println(sentence);


        System.out.println("--------------------------------------------");
        int totalPrice;

        int apple = 5;
        int bread = 20;


        totalPrice = apple + bread;
        System.out.println(totalPrice);


    }


}

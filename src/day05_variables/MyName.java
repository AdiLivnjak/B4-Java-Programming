package day05_variables;

public class MyName {

    public static void main(String[] args) {

      char letter1 = 'A';
      char letter2 = 'd';
      char letter3 = 'i';

        // CONCATENATION
        System.out.println(letter1);
        System.out.println("letter2 = " + letter2);
        System.out.println("letter3 = " + letter3);


        System.out.println();

        // ADDITION
        System.out.println(0 + letter1);
        System.out.println(0 + letter2);
        System.out.println(0 + letter3);

        System.out.println();

        // ADDITION
        System.out.println(letter1 + letter2 + letter3); // int

        String myName = "" + letter1 + letter2 + letter3; // String
        System.out.println(myName);

    }


}

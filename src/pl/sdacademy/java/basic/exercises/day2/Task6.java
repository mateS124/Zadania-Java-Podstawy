package pl.sdacademy.java.basic.exercises.day2;

import static pl.sdacademy.java.basic.exercises.day2.StringValidator.isValid;

public class Task6 {
    public static void main(String[] args) {
      String input = "Ala ma kota";
      char serchedChar = 'a';
      System.out.println(numberOfIndex(input,serchedChar));

       input = "Ala ma kota";
       serchedChar = 'z';
       System.out.println(numberOfIndex(input,serchedChar));
    }

    private static int numberOfIndex(String input, char searchedChar) {

        if (isValid(input)) {
            return input.indexOf(searchedChar);

        }

        return -1;
    }
}

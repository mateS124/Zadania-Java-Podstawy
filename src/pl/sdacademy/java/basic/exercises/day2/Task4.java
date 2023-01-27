package pl.sdacademy.java.basic.exercises.day2;

import static pl.sdacademy.java.basic.exercises.day2.StringValidator.isValid;

public class Task4 {
    private static final String REPLEACMENT = "-STOP-";

    public static void main(String[] args) {
      String input = "Ala ma kota";
      System.out.println(repleaceString(input));

    }

    private static String repleaceString(String input) {
        if (isValid(input)){
         return  input
                 .replace(".", REPLEACMENT)
                 .replace(",", REPLEACMENT);

        }
        return input;
    }
}

package pl.sdacademy.java.basic.exercises.day2;

import static pl.sdacademy.java.basic.exercises.day2.StringValidator.isValid;

public class Task2 {
    public static void main(String[] args) {
       // String  ;
        String input = "Input";
        String prefix = "I";

        String result = String.valueOf(isPrefix(input, prefix));
        System.out.println(result);

    }

    private static boolean isPrefix(String input, String prefix){
        if (isValid(input) && isValid(prefix)) {
            return input.startsWith(prefix);
        }
        return false;

    }
}

package pl.sdacademy.java.basic.exercises.day2;

import static pl.sdacademy.java.basic.exercises.day2.StringValidator.isValid;

public class Task5 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char searchedChar = 'a';
        System.out.println("Result" + countingSerchedChar("Ala ma kota" , 'a'));

         input = "Ala ma kota";
         searchedChar = 'z';
        System.out.println("Result" + countingSerchedChar("Ala ma kota" , 'z'));
    }

    private static int countingSerchedChar(String input, char searchedChar){
       int counter = 0;
        if (isValid(input)){
           for (int i = input.indexOf(searchedChar); i < input.length(); i++){
                if(input.charAt(i) == searchedChar){
                    counter++;
                }
            }

        }

        return counter;

    }
}

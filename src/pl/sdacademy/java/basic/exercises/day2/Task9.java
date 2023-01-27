package pl.sdacademy.java.basic.exercises.day2;

import java.util.Scanner;

public class Task9 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
         String longest = getStringFromUser();
        System.out.println("Najdłuższy tekst to: " +"\"" + longest + "\" ");

    }

    private static String getStringFromUser() {
        String input;
        String longestWorld = null;
        int lengthOfTheLongestWorld = 0;

           do {
               System.out.println("Insert your text: ");
               input = scanner.nextLine();
               if (input.isBlank()){
                   System.out.println("No input");
               }else if (!"Enought".equals(input)){
                   if (lengthOfTheLongestWorld < input.length()){
                       lengthOfTheLongestWorld = input.length();
                       longestWorld = input;
                   }
               }

           } while (!"Enought".equals(input));

       return longestWorld;
    }



}

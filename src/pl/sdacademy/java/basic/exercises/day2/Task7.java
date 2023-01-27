package pl.sdacademy.java.basic.exercises.day2;

import java.util.Scanner;

//import static pl.sdacademy.java.basic.exercises.day2.StringValidator.isValid;

public class Task7 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final char SPACE_SIGN = ' ';

    public static void main(String[] args) {
       String toChecking = takeString();
        //System.out.println(toChecking);
      // char serchedChar = ' ';
        System.out.println(calculatePercentOfSpacesInString(toChecking));

    }

    private static String takeString(){
        System.out.println("Podaj String.");

        return scanner.nextLine();
    }

    private static double calculatePercentOfSpacesInString(String input) {
        if(StringValidator.isValid(input) && input.contains(String.valueOf(SPACE_SIGN))) {
            double spacesCounter = 0;
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == SPACE_SIGN) {
                    spacesCounter++;
                }
            }
            return (spacesCounter / input.length()) * 100;
        }
        return 0;
    }
}

package pl.sdacademy.java.basic.exercises.day2;

import java.util.Scanner;

public class Task11 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input text:");
        String input = scanner.nextLine();
        System.out.println(isPalindrome(input));
    }

    private static boolean isPalindrome(String input) {
       if (StringValidator.isValid(input)){
           int forward = 0;
           int backward = input.length() - 1;
            while(backward > forward){
                char forwardChar = input.charAt(forward);
                char backwardChar = input.charAt(backward);
               if (forwardChar != backwardChar){
                    return  false;
                }
                forward++;
               backward--;
            }
            return true;
        }
       return  false;
    }
}

package pl.sdacademy.java.basic.exercises.day1;

import java.util.Objects;
import java.util.Scanner;

public class Task7 {
    private static final Scanner scanner = new Scanner(System.in);
   // private static String operator;

    public static void main(String[] args) {


        //float first = takeFirstValuFromUser();
        //float second = takeSecondValuFromUser();
        // String operator = takeSignFromUser();
        //System.out.println();

        String operator;
        do {
            float first = takeFirstValuFromUser();

            System.out.println("Wybież działanie * , /, +, - lub \"stop\"  aby zakończyć");
            operator = scanner.next();

            float second = takeSecondValuFromUser();
            //String operator = takeSignFromUser();

            switch (operator) {
                case "*":
                    System.out.println(first + " * " + second + " = " + (first * second));
                    break;
                case "/":
                    System.out.println(first + " / " + second + " = " + (first / second));
                    break;
                case "+":
                    System.out.println(first + " + " + second + " = " + (first + second));
                    break;
                case "-":
                    System.out.println(first + " - " + second + " = " + (first - second));
                    break;
                case "stop":
                    System.out.println("Koniec programu.");
                    break;
                default:
                    System.out.println("Operator not exist");
                    operator = "stop";
                    break;
            }
            System.out.println();
        } while (!Objects.equals(operator, "stop"));
    }

    private static float takeFirstValuFromUser(){
        System.out.println("Podaj pierwszą liczbę: ");
      return  scanner.nextFloat();
    }

    private static float takeSecondValuFromUser(){
        System.out.println("Podaj drugą liczbę: ");
      return  scanner.nextFloat();
    }

//    private static String takeSignFromUser(){
//        System.out.println("Wybież działanie * , /, +, - lub \"stop\"  aby zakończyć");
//       String operator = scanner.next();
//       return operator;
//    }
}

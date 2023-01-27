package pl.sdacademy.java.basic.exercises.day2;

import java.util.Scanner;

public class Task10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(lastLetterFromWorld());

    }

    private static String lastLetterFromWorld(){
        StringBuilder result = new StringBuilder();
        int numberOfWorlds;

        System.out.println("How many worlds you want to put?");
        numberOfWorlds = scanner.nextInt();

        for (int i = 0; i < numberOfWorlds; i++){
                System.out.println("Insert your text: ");
               String world =  scanner.next();
               int index = world.length() - 1;
              result.append(world.charAt(index));



        }



      return result.toString();
    }
}

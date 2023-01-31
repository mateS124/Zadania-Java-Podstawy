package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Task17 {
private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numberArray = takeArray();
        int[] sortedArray = sortArray(numberArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] takeArray(){
        System.out.println("Ile liczb chcesz podać?");
        int arrayLenght = scanner.nextInt();
        int[] numbersArray = new int[arrayLenght ];
        for (int i = 0; i <= arrayLenght - 1; i++){
            System.out.println("Podaj liczbę: ");
            numbersArray[i] = scanner.nextInt();
        }


        return numbersArray;
    }
    private static int[] sortArray(int[] numbersArray){
       // int number = numbersArray[0];
       // int numberIPlusJeden = 0;
        for (int i = 0; i < numbersArray.length; i++){
            for (int j = 0; j < numbersArray.length; j++){
                if (numbersArray[i] < numbersArray[j]){
                    int x = numbersArray[i];
                    int y = numbersArray[j];
                    numbersArray[i] = y;
                    numbersArray[j] = x;
                }
            }
        }
        return numbersArray;
    }
}

package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Task16 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Ile liczb chcesz podac: ");
        int arrayLenght = scanner.nextInt();
        int[] givenArray = takingArray(arrayLenght);
        int[] sortedArray = changeArrayNumersPlaces(givenArray, arrayLenght);
        System.out.println(Arrays.toString(sortedArray));

    }

    private static int[] takingArray(int arrayLenght){

        int[] numberArray = new int[arrayLenght];
        for (int i = 0; i < arrayLenght; i++) {
            System.out.println("Podaj liczbę: ");
            numberArray[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numberArray));


        return numberArray;
    }

    private static int[] changeArrayNumersPlaces(int[] numberArray, int arrayLenght){
        int min;
        int max;
        int j = arrayLenght - 1;
        for (int i = 0; i < numberArray.length / 2; i++){
            min = numberArray[i];
            max = numberArray[j];
            numberArray[i] = max;
            numberArray[j] = min;

            j--;
        }


        return numberArray;

    }
}

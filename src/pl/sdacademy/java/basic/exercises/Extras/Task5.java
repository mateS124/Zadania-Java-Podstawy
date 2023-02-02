package pl.sdacademy.java.basic.exercises.Extras;

import java.util.Scanner;

public class Task5 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Podaj długość index ciągu:");
        int index = scanner.nextInt();

        int result = sequenceFibonacci(index);
        System.out.println();
        System.out.println("Liczba o indeksie: " + index + " to: " + result);



    }

    private static int sequenceFibonacci(int index){
        int[] sequenceFibbo = new int[index];
        sequenceFibbo[0] = 1;
        sequenceFibbo[1] = 1;

        int numberOneBefore = 1;
        int numberTwoBefore = 1;
        for (int i = 2; i < sequenceFibbo.length; i++ ){
            sequenceFibbo[i] = numberOneBefore + numberTwoBefore;
            numberTwoBefore = numberOneBefore;
            numberOneBefore = sequenceFibbo[i] ;
           // System.out.print(sequenceFibbo[i]);
        }
        System.out.println("Ciąg zawiera cyfry: " );

        for (int i = 0; i < sequenceFibbo.length; i++ ){
//            System.out.println();
            System.out.print(sequenceFibbo[i] + ", ");
        }
        int returnIndex = sequenceFibbo[index - 1];

        return returnIndex;
    }

}

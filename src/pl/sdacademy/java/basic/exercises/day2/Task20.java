package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;

public class Task20 {
    public static void main(String[] args) {
     int lenght = 5;
     int firstElement = 3;
     int odds = 3;

     int[] sequences = makeArthmeticSequences(firstElement, lenght, odds );
     System.out.println(Arrays.toString(sequences));

     Boolean isArthmeticSequences = isArthmeticSequence(sequences, odds);
        System.out.println(isArthmeticSequences);

    }

    public static int[] makeArthmeticSequences(int firstElement, int lenght, int odds){
        int[] arthmeticSequences = new int[lenght-1];
        arthmeticSequences[0] = firstElement;
        int counter = firstElement;
        for (int i = 1; i < lenght -1; i++){
            arthmeticSequences[i] = counter + odds ;
            counter = arthmeticSequences[i];
        }

        return arthmeticSequences;
    }

    public  static  boolean isArthmeticSequence(int[] sequence, int odds){
        int beforeElement = sequence[0];
        for (int i = 1; i < sequence.length; i++){
            if (sequence[i] - beforeElement == odds){
                beforeElement = sequence[i];
            }else {
                return false;
            }
        }

        return true;
    }


}

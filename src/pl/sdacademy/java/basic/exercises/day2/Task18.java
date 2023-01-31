package pl.sdacademy.java.basic.exercises.day2;

//import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class Task18 {

    public static void main(String[] args) {
        int[] tab = generateArray();
        countingMultiplyNumbersInArray(tab);

    }

    private static int[] generateArray() {
        int[] array = new int[10];
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            //array[i] = random.nextInt(10) + 1; // dla przypadku gdy liczby mają być z zakresu 0-10
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    private static void countingMultiplyNumbersInArray(int[] array){
       // int[] countedNumbers = new int[10];
        int counter0 = 0;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;
        int counter7 = 0;
        int counter8 = 0;
        int counter9 = 0;
        for (int j : array) {
            if (j == 0) {
                counter0++;
            } else if (j == 1) {
                counter1++;
            } else if (j == 2) {
                counter2++;
            } else if (j == 3) {
                counter3++;
            } else if (j == 4) {
                counter4++;
            } else if (j == 5) {
                counter5++;
            } else if (j == 6) {
                counter6++;
            } else if (j == 7) {
                counter7++;
            } else if (j == 8) {
                counter8++;
            } else if (j == 9) {
                counter9++;
            }
        }
        System.out.println(" 0: " + counter0 + "\n 1: " + counter1 + "\n 2: " + counter2 + "\n 3: " + counter3 + "\n 4: " + counter4 + "\n 5: " + counter5 + "\n 6: " + counter6 + "\n 7: " + counter7 + "\n 8: " + counter8 + "\n 9: " + counter9);



    }
}

package pl.sdacademy.java.basic.exercises.day2;

import java.util.ArrayList;

public class Task14 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(-7);
        numbers.add(19);
        numbers.add(-5);

        System.out.println("Liczby ujemne to: " + findNumber(numbers));
        System.out.println("Ilość liczb ujemnych: " +countNumber(findNumber(numbers)));
    }

    private static ArrayList<Integer> findNumber(ArrayList<Integer> numbers) {
        ArrayList<Integer> minusNumber = new ArrayList<>();
       // Integer count = 0;
        for (int element : numbers) {
            if (element < 0) {
                minusNumber.add(element);
                // count++;
            }
            //return count;
        }
        return minusNumber;
    }

    private static int countNumber(ArrayList<Integer> numbers) {
        int count = 0;
        for (int element : numbers) {
            if (element < 0) {

                count++;
            }

        }
        return count;
    }


}

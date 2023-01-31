package pl.sdacademy.java.basic.exercises.day2;

//import java.util.Arrays;

public class Task19 {

    public static void main(String[] args) {
        Integer[][] firstArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Integer[][] secondarray = {{10,-1,5},{-25,6,6},{12,8,9}};

       Integer[][] biggest =  biggestArray(firstArray, secondarray);

        for (Integer[] integers : biggest) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }

        }
        System.out.println();

        int biggestValu = biggestValue(firstArray, secondarray);
        System.out.println(biggestValu);

        int smallestValue = lowestValue(firstArray, secondarray);
        System.out.println(smallestValue);

    }

    private static Integer[][] biggestArray(Integer[][] first, Integer[][] second){
        int sumFirst = 0;
        int sumSecond = 0;
        Integer[][] biggest;
        for (Integer[] integers : first) {
            for (Integer integer : integers) {
                sumFirst += integer;

            }
        }

        for (Integer[] integers : second) {
            for (Integer integer : integers) {
                sumSecond += integer;
            }
        }


        if (sumFirst > sumSecond){
            biggest = first;
        }else {
            biggest = second;
        }


        return biggest;
    }

    private static int biggestValue(Integer[][] first, Integer[][] second){
        int biggestFirst = 0;
        int biggestSecond = 0;
        int biggest;
        for (Integer[] integers : first) {
            for (int numberfirst : integers) {
                if (numberfirst > biggestFirst) {
                    biggestFirst = numberfirst;
                }

            }
        }

        for (Integer[] integers : second) {
            for (int numberSecond : integers) {
                if (numberSecond > biggestSecond) {
                    biggestSecond = numberSecond;
                }
            }
        }

        biggest = Math.max(biggestFirst, biggestSecond);

        return  biggest;
    }

    private static int lowestValue(Integer[][] first, Integer[][] second){
        int lowestFirst = 0;
        int lowestSecond = 0;
        int lowest;
        for (Integer[] integers : first) {
            for (int numberfirst : integers) {
                if (numberfirst < lowestFirst) {
                    lowestFirst = numberfirst;
                }

            }
        }

        for (Integer[] integers : second) {
            for (int numberSecond : integers) {
                if (numberSecond < lowestSecond) {
                    lowestSecond = numberSecond;
                }
            }
        }


        lowest = Math.min(lowestFirst, lowestSecond);
       // System.out.println(lowestFirst + lowestSecond + lowest );

        return  lowest;
    }


}

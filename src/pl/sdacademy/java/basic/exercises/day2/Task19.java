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
        for (int i = 0; i < first.length; i++){
            for (int j = 0; j < first[i].length; j++){
                sumFirst += first[i][j];

           }
        }

        for (int i = 0; i < second.length; i++){
            for (int j = 0; j < second[i].length; j++){
                sumSecond += second[i][j];
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
        for (int i = 0; i < first.length; i++){
            for (int j = 0; j < first[i].length; j++){
                int numberfirst = first[i][j];
                if (numberfirst > biggestFirst){
                    biggestFirst = numberfirst;
                }

            }
        }

        for (int i = 0; i < second.length; i++){
            for (int j = 0; j < second[i].length; j++){
                int numberSecond = second[i][j];
                if (numberSecond > biggestSecond){
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
        for (int i = 0; i < first.length; i++){
            for (int j = 0; j < first[i].length; j++){
                int numberfirst = first[i][j];
                if (numberfirst <  lowestFirst){
                    lowestFirst = numberfirst;
                }

            }
        }

        for (int i = 0; i < second.length; i++){
            for (int j = 0; j < second[i].length; j++){
                int numberSecond = second[i][j];
                if (numberSecond < lowestSecond){
                    lowestSecond = numberSecond;
                }
            }
        }


        lowest = Math.min(lowestFirst, lowestSecond);
       // System.out.println(lowestFirst + lowestSecond + lowest );

        return  lowest;
    }


}

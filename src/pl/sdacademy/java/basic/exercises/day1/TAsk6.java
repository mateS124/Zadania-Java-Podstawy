package pl.sdacademy.java.basic.exercises.day1;

public class TAsk6 {
    public static void main(String[] args) {

//        int a = 5;
//        int sum ;
//
//        for (int i = 1; i < 5; i++ ){
//            sum = a * i;
//            System.out.println(sum);
//        }

        printMultiplicationTable(6, 2 , 5);


    }

    private static void printMultiplicationTable(int multiplier, int multiplicantMin, int multiolicantMax) {
        int sum;
        for (int i = multiplicantMin; i <= multiolicantMax; i++) {
            sum = multiplier * i;
            System.out.println(multiplier + " x " + i + " = " + sum);
        }


    }
}

package pl.sdacademy.java.basic.exercises.day1;

public class Task8 {
    public static void main(String[] args) {
        int rangeFrom = 0;
        int rangeTo = 10;
    }

    private static boolean isPrimeNumber(int number){
        //number = 7
        /*
        for(int i = 2; i <= 6; i++) {
        7%2 bedzie reszta
        7%3 bedzie reszta
        7%4 bedzie reszta
        7%5 bedzie reszta
        7%6 bedzie reszta
        }
        */

        //number = 9
        /*
        for(int i = 2; i <= 7; i++) {
        9%2 bedzie reszta
        9%3 == 0 nie ma reszty, mamy kolejny dzielnik,
        9%4
        9%5
        9%6
        }
        */

        if (number < 2){
            return false;
        }

        for (int i = 2; i < number; i++){
            if (number%i == 0){
                return false;
            }
        }

        return true;
    }
}

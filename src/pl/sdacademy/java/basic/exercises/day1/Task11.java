package pl.sdacademy.java.basic.exercises.day1;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
    private static final Scanner scanner = new Scanner(System.in);
    //int numberFromComputer =  computerNumber();
    //static String info = checkNumber(computerNumber(),giveNumber());
    public static void main(String[] args) {
        //String info ;
        do {
           int comp = comp();
            System.out.println(comp());
           int user = user();
            //System.out.println(info);
            checkNumber(comp(), user());

        }while(comp() == user());
    }




    private static int user(){
        System.out.println("Podaj liczbę");
       return scanner.nextInt();
    }

    private static int comp(){
        System.out.println("Komputer losuje liczbę.");
        Random ran = new Random();
        return ran.nextInt(100);
    }
    private static void checkNumber(int numberFromComputer, int giveNumber){

        if (numberFromComputer == giveNumber) {
            System.out.println("BINGO");
        }else if (numberFromComputer > giveNumber){
           System.out.println("not enought");
        }else {
            System.out.println("too much");
        }


    }
}

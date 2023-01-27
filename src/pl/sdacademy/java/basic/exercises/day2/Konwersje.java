package pl.sdacademy.java.basic.exercises.day2;

public class Konwersje {
    public static void main(String[] args) {
        //Konwersja liczb zmiennoprzecinkowych na całkowite -> tracimy wartość po przecinku
        int firstValue = (int) 123.456F;
        System.out.println("firstValue" + firstValue);

        long secondValue = (long) 456.789;
        System.out.println("secondValue" + secondValue);

        //automatyczna konwersja typow

        long value3 = 123;  // w rzeczywistosco stworzylismy int konwerowany na long


    }
}

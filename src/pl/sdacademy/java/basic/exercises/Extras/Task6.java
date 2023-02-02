package pl.sdacademy.java.basic.exercises.Extras;

public class Task6 {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++){
            if(i < 10){
                System.out.println(" ");
            }else if (i == 10) {
                System.out.println();
            }
           // System.out.println();
            for (int j = 1; j <= 10; j++){
                if (i * j < 10) {
                    System.out.print(" " + i * j + "  ");
                }else if (i * j >= 10){
                    System.out.print(" " + i * j + " ");
                }
            }
        }
    }
}

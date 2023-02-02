package pl.sdacademy.java.basic.exercises.Extras;

public class Task2 {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'Z';

        int distance = returnDistance(a, b);
        System.out.println(distance);

        char c ='a';
        char d= 'z';
        int distance1 = returnDistance(c, d);
        System.out.println(distance1);

        char e = 'B';
        char f= 'A';
        int distance2 = returnDistance(e, f);
        System.out.println(distance2);



    }

    private  static int returnDistance(char a, char b){
        int counter = 0;
        if ((int) a < (int) b){
//            for (int i = (int) a; i <= (int) b; i++ ){
//                counter++;
//            }
            counter = b - a;
        } else if ((int) a > (int) b){
//            for (int i = (int) a - 1; i > (int) b; i-- ){
//                counter++;
//            }
            counter = a -b;
        }

        return counter;
    }

}

package pl.sdacademy.java.basic.exercises.Extras;

public class Task8 {
    public static void main(String[] args) {
        int[][] numbers = new int[3][11];

        for (int i = 0; i < 3; i++ ){

                if ( i  == 0 ){
                    for (int j = 1; j <= 10; j++) {
                        numbers[0][j] = j;
                        System.out.print(numbers[0][j] + "   ");
                    }
                }

                if ( i  == 1 ){
                    for (int j = 1; j <= 10; j++) {
                        numbers[1][j] = j * j;
                        if ((j * j) < 10){
                            System.out.print(numbers[1][j] + "   ");

                        } else if ((j * j) > 10){
                            System.out.print(numbers[1][j] + "  ");
                        }

                    }
                }

                if ( i  == 2 ){
                    for (int j = 1; j <= 10; j++) {
                        numbers[2][j] = j * j * j;
                        if (j * j * j < 10){
                            System.out.print(numbers[2][j] + "   ");
                        } else if (j * j * j > 10 && j * j * j < 100) {
                            System.out.print(numbers[2][j] + "  ");
                        } else if (j * j * j > 100) {
                            System.out.print(numbers[2][j] + " ");
                        }
                    }
                }
                System.out.println( );
        }
    }

}

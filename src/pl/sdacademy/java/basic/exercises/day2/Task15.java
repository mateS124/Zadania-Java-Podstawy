package pl.sdacademy.java.basic.exercises.day2;

public class Task15 {
    public static void main(String[] args) {
        String[] input = {"Ala", "Kot", "Pies"};
        String[] input2 = {null, "Kot", "Pies"};

        System.out.println(isEquals(input, input2));
    }

    private static boolean isEquals(String[] input, String[] input2 ){
        if (input.length != input2.length){
            return false;
        }
        for (int i = 0; i < input.length; i ++){
            String inputElement = input[i];
            String input2Element = input2[i];
            if (inputElement == null && input2Element == null) {

                continue;
            }
            if (inputElement == null ||(!inputElement.equals(input2Element))){
                return false;
            }
        }

       return  true;
    }
}

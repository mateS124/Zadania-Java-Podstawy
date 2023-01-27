package pl.sdacademy.java.basic.exercises.day2;

public class Task8 {
    private static final int VALUE_UPPER_A_IN_ASCII = 65;
    private static final int VALUE_UPPER_Z_IN_ASCII = 90;
    private static final int VALUE_LOWER_A_IN_ASCII = 97;
    private static final int VALUE_LOWER_Z_IN_ASCII = 122;
    private static final int Diff_UPPER_AND_LOWER_IN_ASCII = 32;

    public static void main(String[] args) {
    String input = "Ala ma Kota";

        System.out.println(repleaceChar(input));

    }

    private static String repleaceChar(String input){
        if (StringValidator.isValid(input)){
           // String result = "";
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < input.length(); i++){
                char currntChar = input.charAt(i);
                if (currntChar >= VALUE_UPPER_A_IN_ASCII && currntChar <= VALUE_UPPER_Z_IN_ASCII){
                   result.append((char) (currntChar + Diff_UPPER_AND_LOWER_IN_ASCII));

                }else if (currntChar >= VALUE_LOWER_A_IN_ASCII && currntChar <= VALUE_LOWER_Z_IN_ASCII){
                    result.append ((char) (currntChar - Diff_UPPER_AND_LOWER_IN_ASCII));
                }else {
                    result.append(currntChar);
                }

            }
            return result.toString();
        }
       return null;
    }
}

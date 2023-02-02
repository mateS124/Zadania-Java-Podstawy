package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;

public class Task12 {

    public static void main(String[] args) {
        String text = "bardzo lubie programowac";
        int shift = 2;

        System.out.println(encryptedString(text, shift));

    }

    public static char[] encryptedString(String text, int shift){
        char[] textToArray;
        textToArray = text.toCharArray();
        System.out.println(textToArray);
        char[] encrypted = new char[text.length()];
        int index = text.length();
        System.out.println(index);
        char[] forReturn = new char[index];

        for (int i = 0; i <= (textToArray.length - 1); i++){
                int charArray = textToArray[i];
                //System.out.print(charArray);

                //System.out.print(textToArray[i]);
                if (charArray < 122) {

                    encrypted[i] = (char) (charArray + shift);
                } else if (charArray + shift > 122) {
                    int shiftOverZ;
                    shiftOverZ = shift - (122 - charArray);
                    encrypted[i] = (char) (96 + shiftOverZ);
                } else if (charArray > 122){
                    encrypted[i] = (char) (96 + shift);

                }



        }
        System.out.println();


        for (int j = 0; j <= (encrypted.length - 1); j++) {
            int charArrayE = encrypted[j];
            int indexFR = j;
            System.out.print(indexFR);

             if ((charArrayE == 34)){
                index--;
               indexFR--;
            }
             if (charArrayE != 34){
                forReturn[indexFR]  = encrypted[j];

            }



        }
        //System.out.println(Arrays.toString(forReturn));
        return forReturn;
    }
}

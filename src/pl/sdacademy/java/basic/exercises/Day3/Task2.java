package pl.sdacademy.java.basic.exercises.Day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    private static final String REGEX_IBAN = "[P][L][0-9]{26}";
    public static void main(String[] args) {

        String iban = "PL09876543211234567896543210";
       // String iban = "0987654321123456789654321";
        //String iban = "sda@com.pl.pl";
        System.out.println(isCorrectEmailFormat(iban));
    }
    private static boolean isCorrectEmailFormat(String iban) {
        Pattern pattern = Pattern.compile(REGEX_IBAN);
        //return pattern.matcher(emailAddress).matches();
        Matcher matcher = pattern.matcher(iban);
        return matcher.matches();
    }
}

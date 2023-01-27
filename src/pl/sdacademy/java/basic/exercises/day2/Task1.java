package pl.sdacademy.java.basic.exercises.day2;

public class Task1 {
   // private static final DEFAULT_CHAR = '\'  ;
    public static void main(String[] args) {
        String input = "ala";
        System.out.println("Original word: " + input);
        System.out.println("Last char: " + getLAstCHaracter(input));

        input = "domek";
        System.out.println("Original word: " + input);
        System.out.println("Last char: " + getLAstCHaracter(input));

        //błąd pusty String trzeba się zabezpieczyć przed wyjątkiem
        input = "";
        System.out.println("Original word: " + input);
        System.out.println("Last char: " + getLAstCHaracter(input));

        //błąd null
        input = null;
        System.out.println("Original word: " + input);
        System.out.println("Last char: " + getLAstCHaracter(input));
    }

    private static char getLAstCHaracter(String input){
        if (input != null && !input.isEmpty()) {
            int lastrPosition = input.length() - 1;
            return input.charAt(lastrPosition);
        }
        return  0;//DEFAULT_CHAR;
    }
}

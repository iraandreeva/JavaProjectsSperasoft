import java.util.Scanner;

public class JavaFundamentalPractice4 {

    /*
    Implement a program that requests an input of 1 symbol form
    the consoles and counts
     a number occurrences of this symbol in a pre-created text
     and prints it to the console. The text may be hard-coded as a String
      in your code.
     */
    public static void main(String[] args) {
        String text, symbol;

        System.out.println("Enter text:");
        Scanner sc1 = new Scanner(System.in);
        text = sc1.nextLine();
        System.out.println("Enter symbol:");
        Scanner sc2 = new Scanner(System.in);
        symbol = sc2.nextLine();
        char sym = symbol.charAt(0);
        System.out.println("Count of symbols '" + sym + "' in the text = " + FindSymbol(text, symbol));


    }

    public static int FindSymbol(String text, String sym) {
        int count = 0;
        char symbol = sym.charAt(0);
        for (char num : text.toCharArray()) {
            if (num == symbol)
                count++;
        }

        return count;
    }
}

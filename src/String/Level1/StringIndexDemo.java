package String.Level1;

import java.util.Scanner;

public class StringIndexDemo {

    public static void generateException(String text) {

        // Invalid index
        System.out.println(text.charAt(text.length()));
    }

    public static void handleException(String text) {

        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Handled: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.next();

        // Uncomment to generate exception
        // generateException(text);

        handleException(text);

        input.close();
    }
}

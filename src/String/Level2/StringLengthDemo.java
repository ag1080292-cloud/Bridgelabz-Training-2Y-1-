package String.Level2;

import java.util.Scanner;

public class StringLengthDemo {

    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.next();

        int userLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length using charAt(): " + userLength);
        System.out.println("Length using length(): " + builtInLength);

        input.close();
    }
}

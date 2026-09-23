package String.Level1;

import java.util.Scanner;

public class StringToCharArray {

    public static char[] getCharacters(String text) {

        char[] chars = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }

        return chars;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.next();

        char[] userArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        boolean result = compareArrays(userArray, builtInArray);

        System.out.println("Arrays are equal: " + result);

        input.close();
    }
}

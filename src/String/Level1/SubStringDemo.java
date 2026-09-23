package String.Level1;

import java.util.Scanner;

public class SubStringDemo {

    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.next();

        System.out.print("Enter start index: ");
        int start = input.nextInt();

        System.out.print("Enter end index: ");
        int end = input.nextInt();

        String userSubstring = createSubstring(text, start, end);
        String builtInSubstring = text.substring(start, end);

        boolean result = compareStrings(userSubstring, builtInSubstring);

        System.out.println("User Substring: " + userSubstring);
        System.out.println("Built-in Substring: " + builtInSubstring);
        System.out.println("Are Equal? " + result);

        input.close();
    }
}
package String.Level3;

import java.util.Scanner;

public class AnagramCheck {

    public static boolean isAnagram(
            String text1, String text2) {

        if (text1.length() != text2.length()) {
            return false;
        }

        int[] frequency = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            frequency[text1.charAt(i)]++;
            frequency[text2.charAt(i)]--;
        }

        for (int value : frequency) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = input.nextLine();

        System.out.print("Enter second text: ");
        String text2 = input.nextLine();

        if (isAnagram(text1, text2)) {
            System.out.println("The texts are Anagrams.");
        } else {
            System.out.println("The texts are NOT Anagrams.");
        }

        input.close();
    }
}

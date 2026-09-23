package Arrays.Level2;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();

        String numStr = String.valueOf(Math.abs(number));

        int[] digits = new int[numStr.length()];
        int[] frequency = new int[10];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("Digit Frequencies:");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " -> " + frequency[i]);
            }
        }

        input.close();
    }
}

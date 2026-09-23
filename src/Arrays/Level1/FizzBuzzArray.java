package Arrays.Level1;

import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        String[] result = new String[number + 1];

        // Store results
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i] = "Fizz";
            } else if (i % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(i);
            }
        }

        // Display results
        for (int i = 0; i < result.length; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }

        input.close();
    }
}
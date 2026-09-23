package Arrays.Level1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Array to store multiplication results from 1 to 10
        int[] table = new int[10];

        // Store results in the array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        input.close();
    }
}

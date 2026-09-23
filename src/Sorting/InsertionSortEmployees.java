package Sorting;

import java.util.Scanner;

public class InsertionSortEmployees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of employee IDs: ");
        int n = input.nextInt();

        int[] ids = new int[n];

        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) {
            ids[i] = input.nextInt();
        }

        // Insertion Sort
        for (int i = 1; i < n; i++) {
            int key = ids[i];
            int j = i - 1;

            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }

            ids[j + 1] = key;
        }

        System.out.println("Sorted Employee IDs:");
        for (int id : ids) {
            System.out.print(id + " ");
        }

        input.close();
    }
}

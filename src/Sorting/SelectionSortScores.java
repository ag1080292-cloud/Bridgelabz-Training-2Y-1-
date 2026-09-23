package Sorting;
import java.util.Scanner;

public class SelectionSortScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of exam scores: ");
        int n = input.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = input.nextInt();
        }

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }

        System.out.println("Sorted Scores:");
        for (int score : scores) {
            System.out.print(score + " ");
        }

        input.close();
    }
}

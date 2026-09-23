package LinearandBinarySearch;

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int left = 0;
        int right = n - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        System.out.println("Peak Element: " + arr[left]);
        System.out.println("Peak Index: " + left);

        input.close();
    }
}

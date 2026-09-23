package LinearandBinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // -------- Linear Search Part --------
        int firstMissingPositive = 1;

        while (true) {
            boolean found = false;

            for (int i = 0; i < n; i++) {
                if (arr[i] == firstMissingPositive) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                break;
            }

            firstMissingPositive++;
        }

        System.out.println("First Missing Positive Integer: "
                + firstMissingPositive);

        // -------- Binary Search Part --------
        Arrays.sort(arr);

        System.out.print("Enter target element to search: ");
        int target = input.nextInt();

        int left = 0;
        int right = arr.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Sorted Array: "
                + Arrays.toString(arr));
        System.out.println("Target Index: " + index);

        input.close();
    }
}
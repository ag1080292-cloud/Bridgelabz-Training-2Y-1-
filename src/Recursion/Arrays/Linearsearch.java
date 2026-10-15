package Recursion.Arrays;

public class Linearsearch {
    public static int search(int arr[], int i, int target) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return search(arr, i + 1, target);
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 4, 3, 2};
        System.out.println(search(arr, 0, 4));
    }
}

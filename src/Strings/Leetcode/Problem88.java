package Strings.Leetcode;

import java.util.Arrays;

public class Problem88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        Problem88 obj = new Problem88();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        obj.merge(nums1, 3, nums2, 3);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}


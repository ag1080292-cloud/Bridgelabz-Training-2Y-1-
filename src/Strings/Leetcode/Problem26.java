package Strings.Leetcode;



public class Problem26 {
    public int removeDuplicates(int[] nums) {
        int start = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[start]) {
                start++;
                nums[start] = nums[i];
            }
        }
        return start + 1;
    }
    public static void main(String[] args) {
        Problem26 obj = new Problem26();
        int[] nums = {1, 1, 2};
        int k = obj.removeDuplicates(nums);
        System.out.println("k = " + k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}


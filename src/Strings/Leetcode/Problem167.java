package Strings.Leetcode;

public class Problem167 {
    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                return new int[]{start + 1, end + 1};
            }
            else if (sum < target) {
                start++;
            }
            else {
                end--;
            }
        }
        return new int[]{0, 0};
    }
    public static void main(String[] args) {
        Problem167 obj = new Problem167();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = obj.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}

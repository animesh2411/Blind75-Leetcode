package Solutions;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxSoFar = Math.max(nums[i], maxSoFar + nums[i]);
            max = Math.max(max, maxSoFar);
        }
        return max;
    }
}

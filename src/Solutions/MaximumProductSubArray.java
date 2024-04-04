package Solutions;

public class MaximumProductSubArray {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Update max and min product considering the current element
            int tempMaxProduct = Math.max(nums[i], Math.max(maxProduct * nums[i], minProduct * nums[i]));
            int tempMinProduct = Math.min(nums[i], Math.min(maxProduct * nums[i], minProduct * nums[i]));

            // Update max product and min product
            maxProduct = tempMaxProduct;
            minProduct = tempMinProduct;

            // Update result
            result = Math.max(result, maxProduct);
        }
        return result;
    }
}

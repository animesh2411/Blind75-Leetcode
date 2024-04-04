package Solutions;

public class ProductOfArrayExceptSelf {

    // O(n) solution
    public int[] productExceptSelf1(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];
        int[] left = new int[len];
        int[] right = new int[len];

        // fill left array
        left[0] = 1;
        for (int i = 1; i < len; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // fill right array
        right[len - 1] = 1;
        for (int i = len - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // fill the answer array
        for (int i = 0; i < len; i++) {
            answer[i] = left[i] * right[i];
        }
        return answer;
    }

    //more optimised solution to save space
    public int[] productExceptSelf2(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];

        // fill left array
        answer[0] = 1;
        for (int i = 1; i < len; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // fill the answer array and update right
        int right = 1;
        for (int i = len - 1; i >= 0; i--) {
            answer[i] = right * answer[i];
            right = right * nums[i];
        }
        return answer;

    }
}

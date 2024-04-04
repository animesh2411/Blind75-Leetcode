package arrayProblems;

import java.util.HashSet;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        // if(numSet.size() == nums.length) {
        //     return false;
        // }
        // return true;

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}

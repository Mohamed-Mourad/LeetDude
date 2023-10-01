import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int j = 0; j < nums.length; j++) {
            // For loop to check sum of all pairs, current position with each other value
            for (int i = 0; i < nums.length; i++) {
                if (j == i) {
                    continue;
                }
                if (nums[j] + nums[i] == target) {
                    // Assuming that there's exactly one solution, we return once we find it
                    return new int[]{j, i};
                }
            }
        }
        // Return an empty array if no solution is found
        return new int[0];
    }
}

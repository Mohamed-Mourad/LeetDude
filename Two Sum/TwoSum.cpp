#include <vector>

class Solution {
public:
    std::vector<int> twoSum(std::vector<int>& nums, int target) {
        for (int j = 0; j < nums.size(); ++j) {
            // For loop to check sum of all pairs, current position with each other value
            for (int i = 0; i < nums.size(); ++i) {
                if (j == i) {
                    continue;
                }
                if (nums[j] + nums[i] == target) {
                    // Assuming that there's exactly one solution, we return once we find it
                    return {j, i};
                }
            }
        }
        // Return an empty vector if no solution is found
        return {};
    }
};
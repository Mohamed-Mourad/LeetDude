class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for j in range(len(nums)):
            #for loop to check sum of all pairs, current position with each other value
            for i in range(len(nums)):
                if j == i:
                    continue
                if nums[j] + nums[i] == target:
                    #assuming that there's exactly one solution, we return once we find it
                    return [j, i]
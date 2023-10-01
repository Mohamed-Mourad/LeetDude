class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        pos: int = 0  #current position
        for i in range(len(nums)):
            #for loop to check sum of all pairs, current position with each other value
            if pos == i:
                continue
            if nums[pos] + nums[i] == target:
                #assuming that there's exactly one solution, we return once we find it
                return [pos, i]
            pos+=1
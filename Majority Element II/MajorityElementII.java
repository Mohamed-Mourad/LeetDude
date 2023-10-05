import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> uniqueVals = new HashMap<>();
        int third = nums.length/3;
        List<Integer> toReturn = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(uniqueVals.containsKey(nums[i])) {
                uniqueVals.replace(nums[i], uniqueVals.get(nums[i])+1);
            } else {
                uniqueVals.put(nums[i], 1);
            }
        }

        for (Integer key : uniqueVals.keySet()) {
            if (uniqueVals.get(key) > third) {
                toReturn.add(key);
            }
        }

        return toReturn;
    }
}
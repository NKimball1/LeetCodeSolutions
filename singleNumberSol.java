import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        Hashtable<Integer, Integer> numbers = new Hashtable<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (numbers.containsKey(nums[i])) {
                nums[numbers.get(nums[i])] = 0;
                nums[i] = 0;
               
            }
            numbers.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                return nums[i];
            }
        }
        
         return 0;
    }
}
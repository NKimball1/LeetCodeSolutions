import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
         Hashtable<Integer, Integer> numbers = new Hashtable<Integer, Integer>();
         for (int i = 0; i < nums.length; i++) {
             numbers.put(nums[i], nums[i]);
         }
        
         for (int i = 0; i < nums.length + 1; i++) {
             if (!numbers.containsKey(i)) {
                 return i;
             }
         }
        
        return -1;
    }
}
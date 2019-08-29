import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
          Hashtable<Integer, Integer> numbers = new Hashtable<Integer, Integer>();
          for (int i = 0; i < nums.length; i++) {
              if (numbers.containsKey(nums[i])) {
                  return nums[i];
              }
              numbers.put(nums[i], i);
          }
        
        return -1;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] ans = new int[2];
        
        
        //First thought- Start w/ ind 0, iter through add    
        for (int i = 0; i < nums.length; i++) {
            
            for (int j = 0; j < nums.length; j++) {
                
                if (j != i && nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
                
            }
            
        }

        return ans;
        
    }
}
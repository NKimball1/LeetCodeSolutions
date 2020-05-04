class Solution {
    public void moveZeroes(int[] nums) {
        
        //Keep track of where to place 0's at end of array
        int tail = nums.length;
        
        int i = 0;
        while (i < tail) {
            int j = i;
            if (nums[i] == 0) {
                while (j < tail - 1) {
                    nums[j] = nums[j + 1];
                    j++;
                }
                nums[tail - 1] = 0;
                tail--;
            }
            
            if (nums[i] != 0) i++;
            
        }
        
        
    }
}
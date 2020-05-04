class Solution {
    public int removeDuplicates(int[] nums) {
        //keep track of where to place non-dup
        int ptr = 1;
        
        //Iterate through, if a number is a non-duplicate, place at ptr
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[ptr] = nums[i];
                ptr++;
            }
        }
        
        return ptr;
    }
}
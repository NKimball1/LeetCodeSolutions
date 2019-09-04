class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] output = new int[nums.length];
        
        if (nums.length <= 2) {
            int c = output[0];
            output[0] = output[1];
            output[1] = c;
        }
        
        //Arrays hold total sums built from L/R
        int[] l = new int[nums.length];
        int[] r = new int[nums.length];
        int sumL = 1;
        int sumR = 1;
        
        
        //Build sums from left, right
        int j = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            sumL *= nums[i];
            sumR *= nums[j];
            l[i] = sumL;
            r[i] = sumR;
            j--;
        }
        
        //First, last index output intuitive
        output[0] = r[nums.length - 2];
        output[nums.length - 1] = l[nums.length - 2];
        
        //Build output from sums
        //Counters for sum indexes
        int lSum = 0;
        int rSum = nums.length - 3;
        for (int i = 1; i < nums.length - 1; i++) {
            output[i] = l[lSum] * r[rSum];
            lSum++;
            rSum--;
        }
        
        return output;
        
    }
}
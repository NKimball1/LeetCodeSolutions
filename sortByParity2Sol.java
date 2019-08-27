class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] odd = new int[A.length / 2];
        int[] even = new int[A.length / 2];
        
        int o = 0;
        int e = 0;
        //Sort even/odds into seperate arrays
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                even[e] = A[i];
                e++;
            } else {
                odd[o] = A[i];
                o++;
            }
        }
        
        //Put evens in even indices and vice versa
        o = 0;
        e = 0;
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                A[i] = even[e];
                e++;
            } else {
                A[i] = odd[o];
                o++;
            }
        }
        
        return A;
        
    }
}
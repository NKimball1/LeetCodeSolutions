class Solution {
    public int[] diStringMatch(String S) {
        int high = S.length();
        int low = 0;
        int[] A = new int[S.length() + 1];
        
        
        
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                 A[i] = low;
                 low++;
            } else {
                A[i] = high;
                high--;
            }
        }
        
        if (S.charAt(S.length() - 1) == 'I') {
            A[S.length()] = low;
        } else {
             A[S.length()] = high;
        }
        
        return A;
    }
}
class Solution {
    public int binaryGap(int N) {
        String b = Integer.toBinaryString(N);
        int maxGap = 0;
        int gap = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '0') {
                gap = 1;
                while (i + gap < b.length()) {
                    if (b.charAt(i + gap) == 0) gap++;
                }
                maxGap = Math.max(gap, maxGap);
                gap = 0;
            }
        }
        
       return maxGap;
    }
}
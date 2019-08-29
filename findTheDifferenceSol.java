import java.util.*;

class Solution {
    public char findTheDifference(String s, String t) {
       int[] countS = new int[26];
       int[] countT = new int[26];
       
        for (int i = 0; i < t.length(); i++) {
            if (i != t.length() - 1) {
                countS[(int)(s.charAt(i) - 97)]++;
            }
            
            countT[(int)(t.charAt(i) - 97)]++;
            
        }
        
        for (int i = 0; i < countS.length; i++) {
            if (countS[i] != countT[i]) {
                return (char)(i + 97);
            }
        }
        
        return '0';
    }
}
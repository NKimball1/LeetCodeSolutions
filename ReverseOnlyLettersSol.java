class Solution {
    public String reverseOnlyLetters(String S) {
        StringBuilder sb = new StringBuilder(S);
        int r = S.length() - 1;
        Boolean isChar;
        for (int i = 0; i < S.length(); i++) {
           if (isChar(S.charAt(i))) {
               if (isChar(S.charAt(r))) {
                   sb.setCharAt(i, S.charAt(r));
                   r--;
               } else {
                   while (!isChar(S.charAt(r))) {
                       r--;
                   }
                sb.setCharAt(i, S.charAt(r));
                r--;
               }
           }
        }
        return sb.toString();
    }
    
    public Boolean isChar(char a) {
        if ((a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z')) {
            return true;
        } else {
            return false;
        }
    }
}
class Solution {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        char temp;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 'a' && str.charAt(i) >= 'A') {
                temp = (char)(str.charAt(i) + 32);
            } else {
                temp = str.charAt(i);
            }
            
            sb.append(temp);

        }
        
        return sb.toString();
    }
}
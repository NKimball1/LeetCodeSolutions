class Solution {
    public int addDigits(int num) {
       
        while (Integer.toString(num).length() != 1) {
            num = add(num);
        }
        
        return num;
    }
    
    public int add(int num) {
        String intString = Integer.toString(num);
        int sum = 0;
        for (int i = 0; i < intString.length(); i++) {
            sum += Character.getNumericValue(intString.charAt(i));
        }
        
        return sum;
    }
}
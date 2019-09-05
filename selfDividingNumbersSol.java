class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> ls = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                ls.add(i);
            }
        }
        
        return ls;
        
    }
    
    public Boolean isSelfDividing(int num) {
        String number = Integer.toString(num);
        Boolean followsRules = true;
        
        for (int i = 0; i < number.length(); i++) {
            int c = Character.getNumericValue(number.charAt(i));
            if (c == 0 || (num % c) != 0) {
                followsRules = false;
                break;
            }
            
            
        }
        
        return followsRules;
        
    }
    
}
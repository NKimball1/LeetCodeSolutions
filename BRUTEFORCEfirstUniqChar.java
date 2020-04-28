 public int firstUniqChar(String s) {
        
        if (s.length() == 1) return 0;
        
        if (s.length() == 0) return -1;
        
        String pre; //Substring before index
        String post; //Substring after index
      
        if (!s.substring(1).contains(String.valueOf(s.charAt(0)))) return 0;
        
        //Iterate through each letter,
        //check that pre/post sub strings don't contain it    
        for (int i = 1; i < s.length(); i++) {
            if (!s.substring(0, i).contains(String.valueOf(s.charAt(i))) &&
                !s.substring(i + 1, s.length()).contains(String.valueOf(s.charAt(i)))) {
                                return i;
            }
        }
        
        return -1;
        
    }
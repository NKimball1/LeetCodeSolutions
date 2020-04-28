public boolean isAnagram(String s, String t) {
        //97 - 122 is undercase alphabet
        
        int[] sCount = new int[26];
        int[] tCount = new int[26];
        final int GAP = 97;
        
        for(int i = 0; i < s.length(); i++) {
            sCount[(int)s.charAt(i) - GAP]++;
        }
        
        for(int i = 0; i < t.length(); i++) {
            tCount[(int)t.charAt(i) - GAP]++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (sCount[i] != tCount[i]) return false;
        }
        
        return true;
        
    }
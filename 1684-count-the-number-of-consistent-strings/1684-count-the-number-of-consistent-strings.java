class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean isNotContains = false;
            
            for(int j = 0; j < word.length(); j++) {
                String c = String.valueOf(word.charAt(j));
                
                if(!allowed.contains(c)) {
                    isNotContains = true;
                }
            }
            
            if(!isNotContains) {
                counter++;
            }
        }
        
        return counter;
    }
}
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int loopLength = 0;
        int word1Length = word1.length;
        int word2Length = word2.length;
                
        if(word1Length > word2Length) {
            loopLength = word1Length;
        } else {
            loopLength = word2Length;
        }
        
        StringBuilder sbWord1 = new StringBuilder();
        StringBuilder sbWord2 = new StringBuilder();
        
        for(int i = 0; i < loopLength; i++) {
            if(i < word1Length) {
                sbWord1.append(word1[i]);
            }
            
            if(i < word2Length) {
                sbWord2.append(word2[i]);
            }
        }
        
        return sbWord1.toString().equals(sbWord2.toString());
    }
}
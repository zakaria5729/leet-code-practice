import java.util.*;

class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> sentenceSet = new HashSet<>();
        
        for(int i = 0; i < sentence.length(); i++) {
            sentenceSet.add(sentence.charAt(i));
        }
        
        return sentenceSet.size() == 26;
    }
}

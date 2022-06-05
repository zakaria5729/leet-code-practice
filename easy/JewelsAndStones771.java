// problem link: https://leetcode.com/problems/jewels-and-stones/submissions/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        
        for(int i = 0; i < jewels.length(); i++) {
            char jewel = jewels.charAt(i);
            
            for(int j = 0; j <stones.length(); j++) {
                if(stones.charAt(j) == jewel) {
                    count++;
                }
            }
        }
        
        return count;
    }
}

//OPTIMAL SOLUTION

import java.util.*;  

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashSet<Character> jewelSet = new HashSet();
        
        for(int i = 0; i < jewels.length(); i++) {
            jewelSet.add(jewels.charAt(i));
        }
        
        for(int j = 0; j <stones.length(); j++) {
            if(jewelSet.contains(stones.charAt(j))) {
                count++;
            }
        }
        
        return count;
    }
}
public class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;
        var anagramMap = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            anagramMap.put(s.charAt(i), anagramMap.getOrDefault(s.charAt(i), 0) + 1);
            anagramMap.put(t.charAt(i), anagramMap.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (char key: anagramMap.keySet()) {
            if (anagramMap.get(key) != 0) return false;
        }

        return true; 
    }
}
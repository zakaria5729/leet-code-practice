public class Solution {
    public boolean isPalindrome(String s) {     
        
        if (s.isEmpty()) return true;
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        
        return true;
    }
}
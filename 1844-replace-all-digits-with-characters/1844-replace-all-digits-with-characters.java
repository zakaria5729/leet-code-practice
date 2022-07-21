class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        // Set<Character> sentenceSet = new HashSet<>();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(i % 2 != 0) {
                char c2 = s.charAt(i - 1);
                int in = (int) c2 + (c - '0');
                c = (char) in;
            }
            
            sb.append(c);
        }
        
        return sb.toString();
    }
}
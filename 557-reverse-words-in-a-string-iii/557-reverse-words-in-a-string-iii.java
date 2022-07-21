class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == ' ') {
                for(int j = sb.length() - 1; j >= 0; j--) {
                    result.append(sb.charAt(j));
                }
                
                result.append(" ");
                sb.setLength(0);
            } else {
                sb.append(c);
            }
            
            if(i == s.length() - 1) {
                for(int k = sb.length() - 1; k >= 0; k--) {
                    result.append(sb.charAt(k));
                }
            }
            
        }
        
        return result.toString();
    }
}
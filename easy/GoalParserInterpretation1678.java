// problem link: https://leetcode.com/problems/goal-parser-interpretation/submissions/

class Solution {
    public String interpret(String command) {
        StringBuilder result = new StringBuilder();
        int length = command.length();
        
        for(int i = 0; i < length; i++) {
            char c = command.charAt(i);
            
            if(c == 'G') {
                result.append(c);
            } else if(i + 1 < length) {
                char c2 = command.charAt(i + 1);
                
                if(c == '(' && c2 == ')') {
                    result.append("o");
                    i++;
                } else {
                    result.append("al");
                    i += 3;
                }
            } 
        }
        
        return result.toString();
    }
}

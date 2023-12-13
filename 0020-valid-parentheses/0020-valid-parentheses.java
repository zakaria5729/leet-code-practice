public class Solution {
    
    public boolean isValid(String s) {
        var bracketStack = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            
            if (bracket == ')' || bracket == '}' || bracket == ']') {
                if (bracketStack.isEmpty() ) {
                    return false;
                }
                
                char poppedBracket = bracketStack.pop();
                
                if (bracket == ')' && poppedBracket != '(' || 
                    bracket == '}' && poppedBracket != '{' || 
                    bracket == ']' && poppedBracket != '[') {
                    return false;
                }
            } else {
                bracketStack.push(bracket);
            }
        }
        
        return bracketStack.isEmpty();
    }
}
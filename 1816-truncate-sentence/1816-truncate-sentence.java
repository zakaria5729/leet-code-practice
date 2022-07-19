class Solution {
    public String truncateSentence(String s, int k) {
        int counter = 0;
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        StringBuilder sentence = new StringBuilder();
        
        for(int i = 0; i < length; i++) {
            char c = s.charAt(i);
            
            if(c == ' ' || i == length - 1) {
                if(c != ' ' || i == length - 1) {
                    sb.append(c);
                }
                
                sentence.append(sb.toString());
                sb.setLength(0);
                counter++;
                                
                if(counter == k) {
                    break;
                }
                
                sentence.append(" ");
            } else {
                sb.append(c);
            }
        }
        
        
        return sentence.toString();
    }
}
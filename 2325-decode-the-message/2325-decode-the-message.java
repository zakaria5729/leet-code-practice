class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> keyMap = new HashMap<>();
        
        int value = 97;
        for(int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            
            if(c != ' ' && keyMap.get(c) == null) {
                keyMap.put(c, (char) value);
                value++;
            }
        }
    
        for(int j = 0; j < message.length(); j++) {
            char c = message.charAt(j);
            
            if(c != ' ') {
                sb.append(keyMap.get(c));
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}

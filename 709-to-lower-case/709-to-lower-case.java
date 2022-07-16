class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            int charAscii = (int) s.charAt(i);
            
            if(charAscii >= 65 && charAscii <= 90) {
                charAscii += 32;
            }     
            
            sb.append((char) charAscii);
        }
        
        return sb.toString();
    }
}

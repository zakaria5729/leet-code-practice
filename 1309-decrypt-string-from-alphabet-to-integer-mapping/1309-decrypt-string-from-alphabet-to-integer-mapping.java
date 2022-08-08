class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            if(i + 2 < s.length() && s.charAt(i + 2) == '#') {                
                String c2 = s.substring(i, i + 2);
                int d = Integer.parseInt(c2) + 96;
                sb.append((char) d);
                i += 2;
            } else {
                char c = s.charAt(i);
                int d2 = Integer.parseInt(String.valueOf(c)) + 96;
                sb.append((char) d2);
            }
        }
                
        return sb.toString();
    }
}
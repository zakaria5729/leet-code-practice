class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        StringBuilder sb = new StringBuilder();
        Set<String> morse = new HashSet<>();
        
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            
            for(int j = 0; j < word.length(); j++) {
                int index = (int) word.charAt(j) - 97;
                sb.append(morseCodes[index]);
            }
            
            morse.add(sb.toString());
            sb.setLength(0);
        }
        
        return morse.size();
    }
}
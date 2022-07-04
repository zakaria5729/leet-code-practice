class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] results = new String[words.length];        
        
        for(int i = 0; i <words.length; i++) {
            String word = words[i];
            
            int lastIndex = word.length() - 1;
            int position = Integer.parseInt(String.valueOf(word.charAt(lastIndex)));
            results[position - 1] = word.substring(0, lastIndex);
        }
        
        StringBuilder sb = new StringBuilder();
        for(String res: results) {
            sb.append(res + " ");
        }
        
        return sb.toString().trim();
    }
}
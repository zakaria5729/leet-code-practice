class Solution {
    public List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<String>();
        String[] parts = s.split(":");
        
        String part1 = parts[0];
        String part2 = parts[1];
        
        char value1 = part1.charAt(0);
        char value2 = part2.charAt(0);
        
        int num1 = part1.charAt(1) - '0';
        int num2 = part2.charAt(1) - '0';

        for(char c = value1; c <= value2; c++) {
            for(int i = num1; i <= num2; i++) {
                result.add(c + "" + i);
            }
        }
        
        return result;
    }
}

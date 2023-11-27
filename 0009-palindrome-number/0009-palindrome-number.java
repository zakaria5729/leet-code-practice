public class Solution {
    public boolean isPalindrome(int x) {
        
        if (x == 0) return true;
        if (x < 0) return false;
        
        int quotient = x;
        int reverseNum = 0;
        
        while (quotient != 0) {
            int reminder = quotient % 10;
            reverseNum = (reverseNum * 10) + reminder;
            quotient = quotient / 10;
        }
        
        return x == reverseNum;
    }
}
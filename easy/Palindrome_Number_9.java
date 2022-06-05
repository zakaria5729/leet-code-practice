// problem link: https://leetcode.com/problems/palindrome-number/

public class Palindrome_Number_9 {

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(1234567899);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(int x) {
        if(x == 0) return true;
        if(x <= -1) return false;

        int temp = x;
        StringBuilder palindromeValue = new StringBuilder();

        while (temp > 0) {
            int remains = temp % 10;
            palindromeValue.append(remains);
            temp /= 10;
        }

        System.out.println(palindromeValue.toString());

        return Long.parseLong(palindromeValue.toString()) == x;
    }
}
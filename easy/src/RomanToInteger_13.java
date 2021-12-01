import java.util.HashMap;
import java.util.Map;

// problem link: https://leetcode.com/problems/longest-common-prefix/

public class RomanToInteger_13 {

    public static void main(String[] args) {
        int value = romanToInt("MCMXCIV");
        System.out.println(value);
    }

    public static int romanToInt(String s) {
        int sum = 0;

        Map<String, Integer> hashMap = new HashMap<>() {{
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
            put("IV", 4);
            put("IX", 9);
            put("XL", 40);
            put("XC", 90);
            put("CD", 400);
            put("CM", 900);
        }};

        for (int i = 0; i < s.length(); i++) {
            String roman = String.valueOf(s.charAt(i));

            if(i < s.length() - 1) {
                roman += s.charAt(i + 1);
            }

            if(hashMap.containsKey(roman)) {
                sum += hashMap.get(roman);
                i++;
            } else {
                sum += hashMap.get(String.valueOf(s.charAt(i)));
            }
        }

        return sum;
    }
}

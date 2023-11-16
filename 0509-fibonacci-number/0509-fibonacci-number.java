public class Solution {
    final Map<Integer, Integer> memo = new HashMap<>();
    
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        
        var value = memo.get(n);
        
        if (value == null) {
            value = fib(n - 1) + fib(n - 2);
            memo.put(n, value);
        }
        
        return value;
    }
}
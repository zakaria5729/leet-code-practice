public class MinStack {
    final Stack<Integer> stack = new Stack<>();
    final Stack<Integer> minValueStack = new Stack<>();

    public MinStack() {}
    
    public void push(int val) {
        stack.push(val);
        
        if (minValueStack.isEmpty() || val < minValueStack.peek()) {
            minValueStack.push(val);
        } else {
            minValueStack.push(minValueStack.peek());
        }
    }
    
    public void pop() {
        stack.pop();
        minValueStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minValueStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
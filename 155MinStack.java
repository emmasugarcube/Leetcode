class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> minStack = new Stack<Integer>();

    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        
        if(x <= min) {
            minStack.push(min);
            min = x;
        }
        minStack.push(x);
    }
    
    public void pop() {
        if(min == minStack.pop()) min = minStack.pop();
    }
    
    public int top() {
        return minStack.peek();
    }
    
    public int getMin() {
        return min;
    }
}
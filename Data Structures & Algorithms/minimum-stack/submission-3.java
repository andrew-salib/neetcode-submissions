class MinStack {
    Stack<Integer> q1; 

    public MinStack() {
        q1 = new Stack<>(); 
    }
    
    public void push(int val) {
        q1.push(val);
    }
    
    public void pop() {
        q1.pop(); 
    }
    
    public int top() {
        return q1.peek(); 
    }
    
    public int getMin() {
        int min = q1.peek(); 
        Stack<Integer> temp = new Stack<>(); 

        while (!q1.isEmpty())
        {
            min = Math.min(min, q1.peek());
            temp.push(q1.pop());
        }

        while (!temp.isEmpty())
        {
            q1.push(temp.pop());
        }

        return min; 
    }
}

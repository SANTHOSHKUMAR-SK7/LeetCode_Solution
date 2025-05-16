class MyQueue {

    Stack<Integer> first;
    Stack<Integer> second;

    public MyQueue() {
        first=new Stack<>();
        second=new Stack<>();        
    }
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop() {
        while(!first.empty()){
            second.push(first.pop());
        }   
        int pop=second.pop();
        while(!second.empty()){
            first.push(second.pop());
        }     
        return pop;
    }
    
    public int peek() {
        while(!first.empty()){
            second.push(first.pop());
        }
        int peak=second.peek();
        while(!second.empty()){
            first.push(second.pop());
        }
        return peak;
    }
    
    public boolean empty() {
        return first.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
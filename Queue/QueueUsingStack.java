//Approch 1
// TC- O(n) SC-O(2n)
class MyQueue {
    Stack<Integer> input=new Stack<>();
    Stack<Integer> output=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) 
    {
        while (input.empty() == false) {
            output.push(input.peek());
            input.pop();
        }
        // Insert the desired element in the stack input
        //System.out.println("The element pushed is " + x);
        input.push(x);
        // Pop out elements from the stack output and push them into the stack input
        while (output.empty() == false) {
            input.push(output.peek());
            output.pop();
        }
    }
    
    public int pop() 
    {
        if (input.empty()) 
        {
            return -1;
        }
        int val = input.peek();
        input.pop();
        return val;
    }
    
    public int peek() {
        if(input.empty()){
            return -1;
        }
        return input.peek();
    }
    
    public boolean empty() {
        if(input.isEmpty()) return true;
        return false;
    }
}

//Approach 2
// TC-O(1) SC-O(2n)
class MyQueue {
    Stack<Integer> input=new Stack<>();
    Stack<Integer> output=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) 
    {
        input.push(x);
    }
    
    public int pop() 
    {
        if (output.isEmpty()) 
        {
            while(!input.isEmpty()){
                output.push(input.peek());
                input.pop();
            }
        }
        int val = output.peek();
        output.pop();
        return val;
    }
    
    public int peek() {
         if (output.isEmpty()){
             while (input.isEmpty() == false) 
             {
                output.push(input.peek());
                input.pop();
            }
         }
        return output.peek();
    }
    
    public boolean empty() {
        if(input.isEmpty() && output.isEmpty()) return true;
        return false;
    }
}

Input
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 1, 1, false]

Explanation
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue is: [1]
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue is [2]
myQueue.empty(); // return false

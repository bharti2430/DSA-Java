public class Deque 
{
    int arr[];
    int front,rear,size;
    public Deque(int n) 
    {
        size=n;
        front=-1;
        rear=-1;
        arr=new int[size];
    }

    // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushFront(int value) 
    {
        if(isFull())
            return false;
        if(isEmpty()){
            front=rear=0;
        }else if(front==0 && rear!=size-1){
            front=size-1;
        } else{
            front--;
        }
        arr[front]=value;
        return true;
    }

    // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushRear(int value) 
    {
        if(isFull())
			return false;
		if(isEmpty()){                              // no element
			front=rear=0;
		}
		else if(rear==size-1 && front!=0){           // rear has to come at front
			rear=0;
		}else{
			rear++;                                // normal flow
		}
		arr[rear]=value;
		return true;
    }

    // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popFront() 
    {
        if(isEmpty()) return -1;                 // queue is empty
		int ans=arr[front];
		if(front==rear){                        // only one element
			front=rear=-1;
		} else if(front==size-1){                 // front at last
			front=0;
		}
		else{
			front++;                            // normal flow
		}
		return ans;
    }

    // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popRear() 
    {
        if(isEmpty()) return -1;
        int ans=arr[rear];
        if(front==rear){
            front=rear=-1;
        }else if(rear==0){
            rear=size-1;
        } else{
            rear--;
        }
        return ans;
    }

    // Returns the first element of the deque. If the deque is empty, it returns -1.
    public int getFront() 
    {
        if(front==-1) return -1;
        return arr[front];
    }

    // Returns the last element of the deque. If the deque is empty, it returns -1.
    public int getRear() 
    {
        if(front==-1) return -1;
        return arr[rear];
    }

    // Returns true if the deque is empty. Otherwise returns false.
    public boolean isEmpty() 
    {
        return (front==-1);
    }

    // Returns true if the deque is full. Otherwise returns false.
    public boolean isFull() 
    {
        if((front==0 && rear==size-1) || (front!=0 && rear==((front-1)%(size-1))))         //Queue is full
			return true;
        return false;
    }
}

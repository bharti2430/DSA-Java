public class CircularQueue {
	int arr[];
	int front,rear,n;
	public CircularQueue(int n) {
		this.n=n;
		front=-1;
		rear=-1;
		arr=new int[n];
	}

	/*
	   Enqueues 'X' into the queue. Returns true if it gets pushed into the stack,
	   and false otherwise.
	*/
	public boolean enqueue(int value) {
		if((front==0 && rear==n-1) || (rear==((front-1)%(n-1))))         //Queue is full
			return false;
		if(front==-1){                              // no element
			front=rear=0;
		}
		else if(rear==n-1 && front!=0){           // rear has to come at front
			rear=0;
		}else{
			rear++;                                // normal flow
		}
		arr[rear]=value;
		return true;
	}

	/*
	  Dequeues top element from queue. Returns -1 if the stack is empty, otherwise
	  returns the popped element.
	*/
	public int dequeue() {
		if(front==-1) return -1;                 // queue is empty
		int ans=arr[front];
		if(front==rear){                        // only one element
			front=rear=-1;
		} else if(front==n-1){                 // front at last
			front=0;
		}
		else{
			front++;                            // normal flow
		}
		return ans;
	}
};

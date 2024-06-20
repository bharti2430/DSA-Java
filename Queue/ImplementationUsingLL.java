class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        QueueNode newnode=new QueueNode(a);
        if(rear==null){
            front=rear=newnode;
            return;
        }
        rear.next=newnode;
        rear=newnode;
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
	    if(front==null) return -1;
        int popEl=front.data;
        front=front.next;
        if (front == null) {
            rear = null;
        }
        return popEl;
	}
}

class MyStack
{
    int top;
	int arr[] = new int[1000];

    MyStack()
	{
		top = -1;
	}
	
	//Function to push an integer into the stack.
    void push(int a)
	{
	    top++;
	    arr[top]=a;
	} 
	
    //Function to remove an item from top of the stack.
	int pop()
	{
        if(top==-1) return -1;
        else{
            int poppedElement=arr[top];
            top--;
            return poppedElement;
        }
	}
}

Input: 
push(2)
push(3)
pop()
push(4) 
pop()
Output: 3, 4

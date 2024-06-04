//iterative
public static Node addOne(Node head) 
    { 
        int carry=1;
        head=reverse(head);
        Node temp=head;
        while(temp!=null){
            temp.data=temp.data+carry;
            if(temp.data<10){
                carry=0;
                break;
            }
            else{
                temp.data=0;
                carry=1;
            }
            temp=temp.next;
        }
        if(carry==1){
            Node newnode=new Node(1);
            head=reverse(head);
            newnode.next=head;
            return newnode;
        }
        head=reverse(head);
        return head;
    }
    public static Node reverse(Node temp)
    {
        Node prev=null,current=temp,front;
        while(current!=null){
            front=current.next;
            current.next=prev;
            prev=current;
            current=front;
        }
        return prev;
    }

//recursive
public static Node addOne(Node head) 
    { 
        int carry=helper(head);
        if(carry==1){
            Node newnode=new Node(1);
            newnode.next=head;
            return newnode;
        }
        return head;
    }
    public static int helper(Node temp)
    {
        if(temp==null) return 1;
        int carry=helper(temp.next);
        temp.data=temp.data+carry;
        if(temp.data<10) return 0;
        temp.data=0;
        return 1;
    }

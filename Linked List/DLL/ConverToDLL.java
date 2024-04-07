 public static Node constructDLL(int []arr) {
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++)
        {
            Node newnode=new Node(arr[i],null,temp);
            temp.next=newnode;
            temp=newnode;
        }
        return head;
    }

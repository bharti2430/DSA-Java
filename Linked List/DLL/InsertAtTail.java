public static Node insertAtTail(Node list, int K) {
        Node temp=list;
        Node newNode=new Node(K);
        if(list==null) return newNode;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        newNode.prev=temp;
        temp.next=newNode;
        return list;
    }

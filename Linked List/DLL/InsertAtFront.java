public static Node insertAtFront(Node head, int k) {
        Node newHead=new Node(k);
        if(head==null) return newHead;
        newHead.next=head;
        head.prev=newHead;
        return newHead;
    }

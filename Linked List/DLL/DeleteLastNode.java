public static Node deleteLastNode(Node head) {
        // Write your code here
        Node temp=head;
        if(head==null || head.next==null) return null;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        Node prevNode=temp.prev;
        prevNode.next=null;
        temp.prev=null;
        return head;
    }

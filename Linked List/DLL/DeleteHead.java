public static Node deleteHead(Node head) {
        if(head==null || head.next==null) return null;
        Node newHead=head.next;
        newHead.prev=null;
        head.next=null;
        return newHead;
    }

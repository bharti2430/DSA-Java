static Node deleteAllOccurOfX(Node head, int x) {
        Node t1=head;
        while(t1!=null){
            if(t1.data==x){
                if(t1==head) head=head.next;
                Node nextNode=t1.next;
                Node prevNode=t1.prev;
                if(nextNode!=null) nextNode.prev=prevNode;
                if(prevNode!=null) prevNode.next=nextNode;
                t1=nextNode;
            }
            else t1=t1.next;
        }
        return head;
    }

Input: 
2<->2<->10<->8<->4<->2<->5<->2
2
Output: 
10<->8<->4<->5

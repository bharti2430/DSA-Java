Node removeDuplicates(Node head){
        Node temp=head;
        while(temp!=null){
            Node nextNode=temp.next;
            while(nextNode!=null && nextNode.data==temp.data){
                nextNode=nextNode.next;
            }
            temp.next=nextNode;
            if(nextNode!=null) nextNode.prev=temp;
            temp=temp.next;
        }
        return head;
    }

Input:
n = 6
1<->1<->1<->2<->3<->4
Output:
1<->2<->3<->4

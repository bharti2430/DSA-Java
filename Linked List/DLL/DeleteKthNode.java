public static Node deleteNode(Node head, int k) {
        Node temp=head;
        int cnt=0;
        if(head==null) return null;
        if(k==1)
        {
            head=head.next;
            if(head!=null) head.prev=null;
            return head;
        }
        while(temp!=null)
        {
            cnt++;
            if(cnt==k) break;
            temp=temp.next;
        }
        head.next=deleteNode(head.next,k-1);
        return head;
    }

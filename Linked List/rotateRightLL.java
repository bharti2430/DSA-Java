public ListNode rotateRight(ListNode head, int k) {
        ListNode tail=head;
        if(head==null) return head;
        int len=1;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        if(k%len==0) return head;
        k=k%len;
        tail.next=head;
        int res=len-k;
        ListNode lastNode=head;
        while(lastNode!=null){
            res--;
            if(res==0) break;
            lastNode=lastNode.next;
        }
        head=lastNode.next;
        lastNode.next=null;
        return head;
    }
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

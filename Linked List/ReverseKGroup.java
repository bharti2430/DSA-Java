public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head,prevNode=null;
        while(temp!=null){
            ListNode kthNode=findKthNode(temp,k);
            if(kthNode==null){
                if(prevNode!=null) prevNode.next=temp;
                break;
            }
            ListNode nextNode=kthNode.next;
            kthNode.next=null;
            reverse(temp);
            if(temp==head) head=kthNode;
            else prevNode.next=kthNode;
            prevNode=temp;
            temp=nextNode;
        }
        return head;
    }
    private ListNode findKthNode(ListNode temp,int k){
        k-=1;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    private ListNode reverse(ListNode temp){
        ListNode prev=null,current=temp,front;
        while(current!=null){
            front=current.next;
            current.next=prev;
            prev=current;
            current=front;
        }
        return prev;
    }

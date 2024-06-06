public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode middle=findMiddle(head);
        ListNode leftHead=head,rightHead=middle.next;
        middle.next=null;
        leftHead=sortList(leftHead);
        rightHead=sortList(rightHead);
        return merge(leftHead,rightHead);
    }
    private ListNode merge(ListNode t1,ListNode t2){
        ListNode dummyNode=new ListNode(-1);
        ListNode temp=dummyNode;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                temp.next=t1;
                temp=t1;
                t1=t1.next;
            }
            else{
                temp.next=t2;
                temp=t2;
                t2=t2.next;
            }
        }
        if(t1!=null){
            temp.next=t1;
        }
        else {
            temp.next = t2;
        }
        return dummyNode.next;
    }
    private ListNode findMiddle(ListNode temp)
    {
        ListNode slow=temp,fast=temp;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

Input: head = [4,2,1,3]
Output: [1,2,3,4]

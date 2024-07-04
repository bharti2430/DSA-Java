public ListNode mergeNodes(ListNode head) {
        ListNode temp=head.next;
        ListNode dummyNode=new ListNode(0);
        ListNode res=dummyNode;
        if(head==null) return head;
        while(temp!=null){
            int sum=0;
            while(temp.val!=0)
            {
                sum+=temp.val;
                temp=temp.next;
            }
            res.next=new ListNode(sum);
            res=res.next;
            if(temp!=null){
                temp=temp.next;
            }
        }
        return dummyNode.next;
    }

Input: head = [0,3,1,0,4,5,2,0]
Output: [4,11]
Input: head = [0,1,0,3,0,2,2,0]
Output: [1,3,4]

//Single pass
public ListNode mergeNodes(ListNode head) {
        ListNode dummyNode=new ListNode(0);
        ListNode res=dummyNode;
        int sum=0;
        if(head==null) return head;
        for (ListNode temp = head.next; temp != null; temp = temp.next)
        {
            if (temp.val != 0)
            {
                sum += temp.val;
            }else
            {
                res.next = new ListNode(sum);
                res = res.next;
                sum = 0;
            }
        }
        return dummyNode.next;
    }

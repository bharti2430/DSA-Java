public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(-1);
        ListNode temp=result;
        int carry=0;
        ListNode t1=l1,t2=l2;
        
        while(t1!=null || t2!=null || carry==1){
            int sum=0;
            if(t1!=null){
                sum+=t1.val;
                t1=t1.next;
            } 
            if(t2!=null){
                sum+=t2.val;
                t2=t2.next;
            } 
            sum+=carry;
            carry=sum/10;
            ListNode newnode=new ListNode(sum%10);
            temp.next=newnode;
            temp=temp.next;
        }
        return result.next;
    }

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

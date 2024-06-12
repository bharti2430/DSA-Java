public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        ListNode result=null;
        for(ListNode list:lists){
        result=merge2List(result,list);
        }
        return result;
    }
    private ListNode merge2List(ListNode head1,ListNode head2){
        ListNode t1=head1,t2=head2;
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
        if(t1!=null) temp.next=t1;
        else temp.next=t2;
        return dummyNode.next;
    }

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]

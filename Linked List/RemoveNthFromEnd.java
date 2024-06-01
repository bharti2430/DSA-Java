//BRUTE
public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len==n){
            head=head.next;
            return head;
        }
  if(len==0 || len==1) return null;
        int res=len-n;
        temp=head;
        while(temp!=null){
            res--;
            if(res==0) break;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }

Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]


//OPTIMAL
public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head,slow=head;
        if(head==null || head.next==null) return null;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }

public ListNode middleNode(ListNode head) {
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int res=(len/2)+1;
        temp=head;
        while(temp!=null){
            res--;
            if(res==0) break;
            temp=temp.next;
        }
        return temp;
    }

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

//OPTIMAL
public ListNode middleNode(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

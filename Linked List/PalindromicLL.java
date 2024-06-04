public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        Stack<Integer> st=new Stack<>();
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            int t=st.pop();
            if(temp.val!=t) return false;
            temp=temp.next;
        }
        return true;
    }

Input: head = [1,2,2,1]
Output: true

//OPTIMAL
public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead=reverse(slow.next);
        ListNode first=head,second=newHead;
        while(first!=null && second!=null){
            if(first.val!=second.val) return false;
            first=first.next;
            second=second.next;
        }
        reverse(newHead);
        return true;
    }
    public ListNode reverse(ListNode temp)
    {
        ListNode prev=null,current=temp,front;
        while(current!=null){
            front=current.next;
            current.next=prev;
            prev=current;
            current=front;
        }
        return prev;
    }

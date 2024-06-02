//BRUTE
public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        Stack<Integer> st=new Stack<>();
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            temp.val=st.pop();
            temp=temp.next;
        }
        return head;
    }

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

//ITERATIVE OPTIMAL
public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head,prev=null,front;
        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }

//RECURSIVE
public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode newHead=reverseList(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }

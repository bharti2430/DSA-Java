//Hashing
public boolean hasCycle(ListNode head) {
        HashSet<ListNode> st=new HashSet<>();
        ListNode temp=head;
        while(temp!=null){
            if(st.contains(temp)) return true;
            st.add(temp);
            temp=temp.next;
        }
        return false;
    }

Input: head = [3,2,0,-4], pos = 1
Output: true

Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

//Optimal
public boolean hasCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }

public static Node deleteNode(Node head, int k) {
        Node temp = head;
    int cnt = 0;
    if (head == null) return null;
    
    // Special case: deleting the head node
    if (k == 1) {
        head = head.next;
        if (head != null)
            head.prev = null;
        return head;
    }

    while (temp != null) {
        cnt++;
        if (cnt == k) break;
        temp = temp.next;
    }

    if (temp == null) {
        // Node at position k not found
        return head;
    }

    Node prevNode = temp.prev;
    Node nextNode = temp.next;

    if (prevNode == null) {
        // Deleting the last node
        nextNode.prev = null;
    } else if (nextNode == null) {
        // Deleting the last node
        prevNode.next = null;
    } else {
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
    return head;
    }

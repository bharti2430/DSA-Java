class Node{
    int value,key;
    Node next,prev;
    Node(int key,int value){
        this.key=key;
        this.value=value;
    }
}
class LRUCache {
    Node head=new Node(0,0);
    Node tail=new Node(0,0);
    int size;
    HashMap<Integer,Node> map=new HashMap<>();
    public LRUCache(int capacity) {
        size=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);        // find node value
            remove(node);
            insert(node);
            return node.value;
        } else {
            return -1;
        } 
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        if (map.size() == size) {
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }
    private void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node) {
        map.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }
}


Input
["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
Output
[null, null, null, 1, null, -1, null, -1, 3, 4]

Explanation
LRUCache lRUCache = new LRUCache(2);
lRUCache.put(1, 1); // cache is {1=1}
lRUCache.put(2, 2); // cache is {1=1, 2=2}
lRUCache.get(1);    // return 1
lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
lRUCache.get(2);    // returns -1 (not found)
lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
lRUCache.get(1);    // return -1 (not found)
lRUCache.get(3);    // return 3
lRUCache.get(4);    // return 4

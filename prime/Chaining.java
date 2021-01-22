package prime;

class MyHashMap {
    
    private class Node{
        int key;
        int value;
        Node next;
        
        public Node(int key, int value){
            this.key = key;
            this.value = value;
            next = null;
        }
    }
    
    private Node[] items;
    
    /** Initialize your data structure here. */
    public MyHashMap() {
        items = new Node[2096];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        if(key < 0) return;
        
        Node node = getIndex(key);
        
        if(node.next == null){
            node.next = new Node(key, value);
        }
        else
            node.next.value = value;
        
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if(key < 0) return -1;
        
        Node node = getIndex(key);
        if(node.next == null)
            return -1;
        else
            return node.next.key == key ? node.next.value : -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        if(key < 0) return;
        
        Node node = getIndex(key);
        if(node.next != null){
            node.next = node.next.next;
        }
    }
    
    private Node getIndex(int key){
        int index = key % items.length;
        
        if(items[index] == null){
            items[index] = new Node(-1, -1);
        }
        
        Node res = items[index];
        while(res.next != null && res.next.key != key){
            res = res.next;
        }
        
        return res;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
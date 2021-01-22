package prime;

class MyHashMap {

    private class Entry{
        int key;
        int value;
        
        public Entry(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    
    private Entry[] items;

    /** Initialize your data structure here. */
    public MyHashMap() {
        items = new Entry[10001];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        if(key < 0) return;
        
        int index = getIndex(key);
        if(items[index] == null)
            items[index] = new Entry(key, value);
        else
            items[index].value = value;   
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if(key < 0) return -1;
        int index = getIndex(key);
        
        if(items[index] == null)
            return -1;
        else
            return items[index].key == key ? items[index].value : -1;
        
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        if(key < 0) return;
        int index = getIndex(key);
        
        if(items[index] != null)
            items[index].key = -1;
    }
    
    private int getIndex(int key){
        int index = key % items.length;
        while(items[index] != null && items[index].key != key){
            index = (index + 1) % items.length;
        }
        
        return index;
    }
}
import java.util.ArrayList;
import java.util.List;

class MyHashMap {

    private List<int[]> myMap;

    public MyHashMap() {
        myMap = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        for (int[] pair : myMap) {
            if (pair[0] == key) {
                pair[1] = value;
                return;
            }
        }
        myMap.add(new int[]{key, value});
    }
    
    public int get(int key) {
        for (int[] pair : myMap) {
            if (pair[0] == key) {
                return pair[1];
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        for(int i=0; i<myMap.size(); i++) {
            if(myMap.get(i)[0] == key) {
                myMap.remove(i);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
package by.bsu.hashtable.openaddressingcollision.entity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by cplus on 22.10.2017.
 */
public class HashTable {
    //private final static int SIZE = 100;
    private final static int HASH_DIGIT = 113;
    private int index;
    private List<Unit> hashTable;

    public HashTable() {
        hashTable = new LinkedList<>();
    }

    public List<Integer> keySet() {
        if (hashTable == null) {
            return null;
        }
        List<Integer> keys = new ArrayList<>();
        for (Unit unit : hashTable) {
            keys.add(unit.getKey());
        }
        return keys;
    }

    public boolean contains(int key) {
        return keySet() != null && keySet().contains(key);
    }

    private void addKey(int key) {
        hashTable.add(new Unit(key));
    }

    public boolean add(long value) {
        /*if (hashTable.size() >= SIZE) {
            return false;
        }*/
        int key = (int) (value % HASH_DIGIT);
        if (contains(key)) {
            addKey(HASH_DIGIT + index++);
            hashTable.get(hashTable.size() - 1).setValue(value);
            return true;
        } else {
            addKey(key);
            hashTable.get(hashTable.size() - 1).setValue(value);
            return true;
        }
    }

    public boolean remove(int key) {
        if (!contains(key)) {
            return false;
        } else {
            for (int i = 0; i < hashTable.size(); ++i) {
                if (hashTable.get(i).getKey() == key) {
                    hashTable.remove(i);
                }
            }
            return true;
        }
    }

    public Integer findValue(long value){
        for(Unit elem: hashTable){
            if(elem.getValue() == value){
                return elem.getKey();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "HashTable{" + hashTable +
                '}';
    }
}

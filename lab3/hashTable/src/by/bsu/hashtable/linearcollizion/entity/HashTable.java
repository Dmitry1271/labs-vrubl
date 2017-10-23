package by.bsu.hashtable.linearcollizion.entity;

import java.util.*;

/**
 * Created by cplus on 22.10.2017.
 */
public class HashTable {
    //private final static int SIZE = 100;
    private final static int HASH_DIGIT = 113;
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
        int key = (int) (value % HASH_DIGIT);
        if (contains(key)) {
            for (Unit elem : hashTable) {
                if (elem.getKey() == key) {
                    elem.getValues().add(value);
                }
            }
            return true;
        } else if (hashTable.size() < HASH_DIGIT) {//
            addKey(key);
            hashTable.get(hashTable.size() - 1).getValues().add(value);
            return true;
        }
        return false;
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

    public Integer find(long value){
        for(Unit elem: hashTable){
            if (elem.getValues().contains(value)){
                return elem.getKey();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "HashTable{" +
                hashTable +
                "\n}";
    }
}

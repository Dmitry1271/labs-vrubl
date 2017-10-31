package by.bsu.hashtable.openaddressingcollision.entity;

import java.util.Arrays;

/**
 * Created by cplus on 22.10.2017.
 */
public class HashTable {
    private final static int HASH_DIGIT = 113;
    private final static int VALUE_FOR_RISING_SIZE = 300;
    private final static double CHANGE_SIZE_NUMBER = 0.3;
    private int free;
    private Unit[] hashTable;
    private int currentSize;

    public HashTable() {
        hashTable = new Unit[HASH_DIGIT];
        free = HASH_DIGIT;
        currentSize = HASH_DIGIT;
    }

    public void add(long value) {
        boolean flag = false;
        for (Unit elem : hashTable) {
            if (elem != null && elem.getValue() == value) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            addRecur(value, 0);
        }
    }


    public boolean remove(long value) {
        for (int i = 0; i < currentSize; ++i) {
            if (hashTable[i] != null && hashTable[i].getValue() == value) {
                hashTable[i] = null;
                return true;
            }
        }
        return false;
    }

    public Integer findValue(long value) {
        for (Unit elem : hashTable) {
            if (elem != null && elem.getValue() == value) {
                return elem.getKey();
            }
        }
        return null;
    }

    private void addRecur(long value, int index) {
        int key = hashFunction(value) + index;

        if (key == currentSize && isNeedChangeSize()) {
            currentSize += VALUE_FOR_RISING_SIZE;
            free += VALUE_FOR_RISING_SIZE;
            hashTable = Arrays.copyOf(hashTable, currentSize);
        } else if (key == currentSize) {
            for (int i = 0; i < currentSize; ++i) {
                if (hashTable[i] == null) {
                    hashTable[i] = new Unit(i);
                    hashTable[i].setValue(value);
                    free--;
                    return;
                }
            }
        }

        if (hashTable[key] == null) {
            hashTable[key] = new Unit(key);
            hashTable[key].setValue(value);
            free--;
        } else {
            addRecur(value, ++index);
        }
    }

    private boolean isNeedChangeSize() {
        return free == currentSize * CHANGE_SIZE_NUMBER;
    }

    private int hashFunction(long value) {
        return (int) (value % HASH_DIGIT);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (Unit elem : hashTable) {
            if (elem != null) {
                string.append(elem.getKey());
                string.append(":").append(elem.getValue()).append("\n");
            }
        }
        return string.toString();
    }
}

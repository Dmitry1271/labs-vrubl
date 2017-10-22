package by.bsu.hashtable.openaddressingcollision.entity;

/**
 * Created by cplus on 22.10.2017.
 */
public class Unit {
    private int key;
    private long value;

    public Unit(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\n" + key + ":" + value;
    }
}

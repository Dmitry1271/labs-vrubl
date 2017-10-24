package by.bsu.hashtable.linearcollizion.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cplus on 22.10.2017.
 */
public class Unit {
    private int key;
    private List<Long> values;

    public Unit(int key) {
        this.key = key;
        this.values = new ArrayList<>();
    }

    public int getKey() {
        return key;
    }

    public List<Long> getValues() {
        return values;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override

    public String toString() {
        return  "\n" + key + ":" + values;
    }
}

package model;

import service.GuitarSpec;

public class Guitar {

    int id;
    String name;
    int count;
    GuitarSpec guitarSpec;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }

    public void setGuitarSpec(GuitarSpec guitarSpec) {
        this.guitarSpec = guitarSpec;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.mad.recyclerview;

public class RecylerModel {
    String name;
    String loc;

    public RecylerModel(String name, String loc) {
        this.name = name;
        this.loc = loc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}


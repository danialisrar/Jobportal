package com.mad.recyclerview;

public class DbModel {


    private String Name;
    private String password;

    public DbModel(String name, String password) {
        Name = name;
        this.password = password;
    }

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

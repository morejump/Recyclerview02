package com.example.hp.recyclerview02;

/**
 * Created by HP on 8/17/2016.
 */
public class Contact {
    private String name;
    private String Sdt;

    public Contact(String name, String sdt) {
        this.name = name;
        Sdt = sdt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String sdt) {
        Sdt = sdt;
    }
}

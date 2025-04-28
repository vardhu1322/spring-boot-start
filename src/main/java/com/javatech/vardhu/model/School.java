package com.javatech.vardhu.model;

import java.util.List;

public class School {
    int id;
   String name;
   String address;
   List<String>DressCodeColor;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getDressCodeColor() {
        return DressCodeColor;
    }

    public void setDressCodeColor(List<String> dressCodeColor) {
        DressCodeColor = dressCodeColor;
    }
}

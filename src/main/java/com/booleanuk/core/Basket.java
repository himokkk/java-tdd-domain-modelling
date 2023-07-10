package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String, Integer> items;

    public Basket() {
        this.items = new HashMap<>();
    }

    public boolean add(String product, int price) {
        if(this.items.containsKey(product))
            return false;
        this.items.put(product, price);
        return true;
    }
}

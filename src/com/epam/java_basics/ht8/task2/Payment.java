package com.epam.java_basics.ht8.task2;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Item> payment = new ArrayList<>();

    public Payment() {
    }

    public void addItem(Item item) {
        payment.add(item);
    }

    public boolean removeItem(Item item) {
        return payment.remove(item);
    }

    public Item findItemByProducer (String producer) {
        for (Item item : payment) {
            if (item.getProducer().equals(producer)) {
                return item;
            }
        }
        return null;
    }

    public List<Item> getItems() {
        return payment;
    }
}



package com.epam.java_basics.ht8.task2;

import java.util.Date;
import java.util.Objects;

public class Item {
    private int price;
    private Date shelfLife;
    private String producer;

    public class Builder {

        public Builder price(int price) {
            Item.this.price = price;
            return this;
        }

        public Builder shelfLife(Date shelfLife) {
            Item.this.shelfLife = shelfLife;
            return this;
        }

        public Builder producer(String producer) {
            Item.this.producer = producer;
            return this;
        }

        public Item build() {
            return Item.this;
        }
    }

    public static Builder newBuilder() {
        return new Item().new Builder();
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "Item{" +
                "price=" + price +
                ", shelfLife=" + shelfLife +
                ", producer='" + producer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return price == item.price &&
                Objects.equals(shelfLife, item.shelfLife) &&
                Objects.equals(producer, item.producer);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = Integer.parseInt(prime * result + producer);
        return result;
    }

}

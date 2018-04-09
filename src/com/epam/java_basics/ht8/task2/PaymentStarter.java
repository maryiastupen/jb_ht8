package com.epam.java_basics.ht8.task2;
import java.util.Date;

public class PaymentStarter {
    public static void main(String[] args) {
        Item chocolateBar = Item.newBuilder()
                .price(50)
                .producer("Nesquik")
                .shelfLife( new Date(2020, 3, 23))
                .build();
        Item chips = Item.newBuilder()
                .price(230)
                .producer("Pringles")
                .shelfLife( new Date(2019, 6, 28))
                .build();

        Payment payment = new Payment();
        payment.addItem(chocolateBar);
        payment.addItem(chips);

        Item item = payment.findItemByProducer("Nestle");
        if (item != null) {
            printItem(item);
        }
        printPayment(payment);
    }

    private static void printPayment(Payment payment) {
        for (Item item : payment.getItems()) {
            printItem(item);
        }
    }

    private static void printItem(Item item) {
        System.out.println(item.toString());
    }
}

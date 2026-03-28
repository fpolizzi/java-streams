package com.fpolizzi.exercises.model;

/**
 * Created by fpolizzi on 28.03.26
 */
public record Transaction(
        int id,
        double amount,
        String type,
        String date,
        Customer customer
) {
    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public Customer getCustomer() {
        return customer;
    }
}

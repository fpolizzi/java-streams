package com.fpolizzi.exercises.data;

import com.fpolizzi.exercises.model.Customer;
import com.fpolizzi.exercises.model.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by fpolizzi on 28.03.26
 */
public class Transactions {

    private final List<Transaction> transactions = new ArrayList<>();

    public Transactions() {
        for (int i = 1; i <= 100; i++) {
            transactions.add(new Transaction(
                    i,
                    Math.random() * 1000,
                    i % 2 == 0 ? "CREDIT" : "DEBIT",
                    "2024-" + String.format("%02d", (i % 12) + 1) + "-" + String.format("%02d", (i % 28) + 1),
                    new Customer(i, "Customer" + i, "customer" + i + "@example.com")
            ));
        }
    }

    public Stream<Transaction> stream() {
        return transactions.stream();
    }
}

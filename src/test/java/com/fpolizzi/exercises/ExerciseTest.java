package com.fpolizzi.exercises;

import com.fpolizzi.exercises.data.Transactions;
import com.fpolizzi.exercises.model.Transaction;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Created by fpolizzi on 28.03.26
 */
public class ExerciseTest {

    private static final Transactions transactions = new Transactions();

    // 01. Filter Transactions by Type
    @Test
    void transactionByType() {
        List<Transaction> creditTransactions = transactions.stream()
                .filter(transaction -> "CREDIT".equals(transaction.type()))
                .toList();

        creditTransactions.forEach(System.out::println);
    }

    // 02. Get Total Amount of All Transactions
    @Test
    void totalAmountOfAllTransactions() {
        double totalAmount = transactions.stream()
                .mapToDouble(Transaction::getAmount)
                .sum();

        System.out.println("Total Amount: " + totalAmount);
    }
}

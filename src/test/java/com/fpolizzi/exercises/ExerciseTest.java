package com.fpolizzi.exercises;

import com.fpolizzi.exercises.data.Transactions;
import com.fpolizzi.exercises.model.Customer;
import com.fpolizzi.exercises.model.Transaction;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by fpolizzi on 28.03.26
 */
class ExerciseTest {

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

    // 03. Find the Maximum Transaction Amount
    @Test
    void maximumTransactionAmount() {
        Transaction maxTransactionAmount = transactions.stream()
                .max(Comparator.comparingDouble(Transaction::getAmount))
                .orElse(null);

        System.out.println("Max Transaction Amount: " + maxTransactionAmount);
    }

    // 04. Count Transactions by Type
    @Test
    void transactionsByType() {
        Map<String, Long> transactionCountByType = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getType, Collectors.counting()));

        System.out.println(transactionCountByType);
    }

    // 05. Get Distinct Customers
    @Test
    void getDistinctCustomers() {
        List<Customer> distinctCustomers = transactions.stream()
                .map(Transaction::getCustomer)
                .distinct()
                .collect(Collectors.toList());

        distinctCustomers.forEach(System.out::println);
    }

    // 06. Find Transactions Above a Threshold
    @Test
    void transactionsAboveAThreshold() {
        List<Transaction> highValueTransactions = transactions.stream()
                .filter(transaction -> transaction.getAmount() > 300)
                .collect(Collectors.toList());

        highValueTransactions.forEach(System.out::println);
    }

    // 07. Group Transactions by Customer
    @Test
    void transactionsByCustomer() {
        Map<Integer, List<Transaction>> transactionsByCustomer = transactions.stream()
                .collect(Collectors.groupingBy(transaction -> transaction.getCustomer().getId()));

        transactionsByCustomer.forEach((customerId, transactions) -> {
            System.out.println("Customer ID: " + customerId);
            transactions.forEach(System.out::println);
        });
    }

    // 08. Find the First Transaction
    @Test
    void findFirstTransaction() {
        Transaction firstTransaction = transactions.stream()
                .findFirst()
                .orElse(null);

        System.out.println("First Transaction: " + firstTransaction);
    }

    // 09. Check for Any High-Value Transaction
    @Test
    void checkForAnyHighValueTransaction() {
        boolean hasHighValueTransaction = transactions.stream()
                .anyMatch(transaction -> transaction.getAmount() > 1000);

        System.out.println("Has high-value transaction: " + hasHighValueTransaction);
    }

    // 10. Sort Transactions by Amount
    @Test
    void sortTransactionsByAmount() {
        List<Transaction> sortedTransactions = transactions.stream()
                .sorted(Comparator.comparingDouble(Transaction::getAmount))
                .collect(Collectors.toList());

        sortedTransactions.forEach(System.out::println);
    }
}

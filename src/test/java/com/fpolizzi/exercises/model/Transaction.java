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
) {}

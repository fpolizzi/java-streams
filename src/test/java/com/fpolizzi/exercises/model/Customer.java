package com.fpolizzi.exercises.model;

/**
 * Created by fpolizzi on 28.03.26
 */
public record Customer(
        int id,
        String name,
        String email
) {
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

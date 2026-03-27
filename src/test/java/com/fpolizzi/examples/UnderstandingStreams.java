package com.fpolizzi.examples;

import com.fpolizzi.beans.Person;
import com.fpolizzi.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UnderstandingStreams {

    @Test
    void collect() throws IOException {
        List<String> emails = MockData.getPeople()
                .stream()
                .map(Person::getEmail)
                .collect(
                        ArrayList::new,
                        ArrayList::add,
                        ArrayList::addAll
                );

        emails.forEach(System.out::println);
    }
}
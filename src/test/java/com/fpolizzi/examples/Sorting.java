package com.fpolizzi.examples;


import com.fpolizzi.beans.Car;
import com.fpolizzi.beans.Person;
import com.fpolizzi.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

    @Test
    public void sortingStreamOfElements() throws IOException {
        List<Person> people = MockData.getPeople();

        List<String> sorted = people.stream()
                .map(Person::getFirstName)
                .sorted()
                .collect(Collectors.toList());
        sorted.forEach(System.out::println);
    }

    @Test
    public void sortingStreamOfElementsReverse() throws IOException {
        List<Person> people = MockData.getPeople();

        List<String> sorted = people.stream()
                .map(Person::getFirstName)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        sorted.forEach(System.out::println);
    }

    @Test
    public void sortingSteamOfObjets() throws IOException {
        List<Person> people = MockData.getPeople();
    }

    @Test
    public void topTenMostExpensiveBlueCars() throws IOException {
        List<Car> cars = MockData.getCars();
    }
}

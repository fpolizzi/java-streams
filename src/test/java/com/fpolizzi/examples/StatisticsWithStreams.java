package com.fpolizzi.examples;


import com.fpolizzi.beans.Car;
import com.fpolizzi.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StatisticsWithStreams {

    @Test
    public void count() throws Exception {
        List<Car> cars = MockData.getCars();
        long count = cars.stream()
                .filter(car -> car.getMake().equalsIgnoreCase("Ford"))
                .filter(car -> car.getYear() > 2010)
                .count();
        System.out.println(count);
    }

    @Test
    public void min() throws Exception {
        List<Car> cars = MockData.getCars();
    }

    @Test
    public void max() throws Exception {
        List<Car> cars = MockData.getCars();
    }


    @Test
    public void average() throws Exception {
        List<Car> cars = MockData.getCars();
    }

    @Test
    public void sum() throws Exception {
        List<Car> cars = MockData.getCars();
    }

    @Test
    public void statistics() throws Exception {
        List<Car> cars = MockData.getCars();
    }

}
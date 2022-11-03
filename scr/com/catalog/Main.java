package com.catalog;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = "file/city_ru.csv";
        Path path = Paths.get(filename);
        Scanner scanner = new Scanner(path);
        ArrayList<City> cities = new ArrayList<>();

        scanner.useDelimiter(System.getProperty("line.separator"));
        while(scanner.hasNext()){
            cities.add(City.parseToCity(scanner.next()));
        }
        System.out.println(cities);
    }
}

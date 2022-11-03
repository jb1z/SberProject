package com.catalog;

import java.io.IOException;
import static com.catalog.CityUtils.*;

public class Main {
    public static void main(String[] args) throws IOException {
        print(parse());
        System.out.println("Sorted by name: ");
        System.out.println(sortByName(parse()));
        System.out.println("Sorted by district and name: ");
        System.out.println(sortByDistrictName(parse()));
    }
}

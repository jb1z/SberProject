package com.catalog;

import java.util.Comparator;
import java.util.List;

import static com.catalog.CityUtils.*;

public class Main {
    public static void main(String[] args) {
        List<City> cities = parse();
        sortByRegion(cities);
        int count = 0;
        String region = cities.get(0).getRegion();
        String anotherRegion;
        for(City city : cities){
            anotherRegion = city.getRegion();
            if(anotherRegion.equals(region)){
                count++;
            } else {
                System.out.println(region + ": " + count);
                count = 1;
            }
            region = city.getRegion();
        }
    }
    private static void sortByRegion(List<City> cities) {
        cities.sort(new Comparator<>() {
            @Override
            public int compare(City o1, City o2) {
                return o1.getRegion().compareToIgnoreCase(o2.getRegion());
            }
        });
    }
}

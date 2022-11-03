package com.catalog;

import java.util.List;

import static com.catalog.CityUtils.*;

public class Main {
    public static void main(String[] args) {
        List<City> cities = parse();
        City[] citiesAsArray = cities.toArray(new City[0]);
        int indexOfMaxPopulation = 0;
        int maxPopulation = 0;
        int cityPopulation = 0;
        int i = 0;
        for(City city : citiesAsArray) {
            if(city.getPopulation() != null) {
                cityPopulation = Integer.parseInt(city.getPopulation());
            }
            if(cityPopulation > maxPopulation) {
                maxPopulation = cityPopulation;
                indexOfMaxPopulation = i;
            }
            i++;
        }
        System.out.println("[" + indexOfMaxPopulation + "]: " + maxPopulation);
    }
}

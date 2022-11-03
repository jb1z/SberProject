package com.catalog;

import java.util.Scanner;

public class City {
    private final String id;
    private final String name;
    private final String region;
    private final String district;
    private final String foundation;
    private final String population;

    public City(String id, String name, String region, String district, String population, String foundation){
        this.id = id;
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }
    private static String hasNext(Scanner scanner) {
        String string;
        if(scanner.hasNext()) {
            string = scanner.next();
        } else {
            string = null;
        }
        return string;
    }
    public static City parseToCity(String nextLine){
        Scanner scanner = new Scanner(nextLine);
        scanner.useDelimiter(";");
        String parsedId = hasNext(scanner);
        String parsedName = hasNext(scanner);
        String parsedRegion = hasNext(scanner);
        String parsedDistrict = hasNext(scanner);
        String parsedPopulation = hasNext(scanner);
        String parsedFoundation = hasNext(scanner);
        return new City(parsedId, parsedName, parsedRegion, parsedDistrict, parsedPopulation, parsedFoundation);
    }

    @Override
    public String toString(){
        return "\nID: " + this.id + " Name: " + this.name + " Region: " + this.region + " District: " + this.district +
                " Population: " + this.population + " Foundation: " + this.foundation ;
    }
}

package com.catalog;

import java.text.MessageFormat;
import java.util.Comparator;
import java.util.List;

import static com.catalog.CityUtils.*;

public class Main {
    /**
     * Поиск города с наибольшим количеством жителей путем простого перебора
     *
     * @param cities массив городов
     */
    private static void findBySimpleBruteForce(List<City> cities) {
        City[] array = new City[cities.size()];
        cities.toArray(array);
        City current = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (Integer.parseInt(array[i].getPopulation()) > Integer.parseInt(current.getPopulation())) {
                current = array[i];
                index = i;
            }
        }
        System.out.println(MessageFormat.format("[{0}] = {1}", index, array[index]));
    }
    private static void sortByRegion(List<City> cities) {
        cities.sort(new Comparator<>() {
                        @Override
                        public int compare(City o1, City o2) {
                            return o1.getRegion().compareToIgnoreCase(o2.getRegion());
                        }
                    });
    }
    /**
     * Поиск города с наибольшим количеством жителей путем сортировки вставками
     *
     * @param cities массив городов
     */
    private static void findByInsertionSort(List<City> cities) {
        City[] array = new City[cities.size()];
        cities.toArray(array);
        for (int i = 1; i < array.length; i++) {
            City current = array[i];
            int j = i - 1;
            while (j >= 0 && Integer.parseInt(current.getPopulation()) < Integer.parseInt(array[j].getPopulation())) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        System.out.println(MessageFormat.format("[{0}] = {1}", array.length - 1, array[array.length - 1]));
    }

    /**
     * Поиск города с наибольшим количеством жителей с использованием lambda-выражений
     *
     * @param cities массив городов
     */
    private static void findMaxPopulation(List<City> cities) {
        System.out.println(cities.stream().max(Comparator.comparing(City::getPopulation)));
    }
    public static void main(String[] args) {
        List<City> cities = parse();
        System.out.println(cities);
    }

}

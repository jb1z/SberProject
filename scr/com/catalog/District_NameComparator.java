package com.catalog;

import java.util.Comparator;

public class District_NameComparator implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        return o1.getDistrict().compareTo(o2.getDistrict());
    }
}

package com.catalog;

import java.util.Comparator;

public class NameComparator implements Comparator<City> {
    private final int ascDesc;
    private final boolean ignoreCase;
    public NameComparator(int ascDesc, boolean ignoreCase) {
        this.ascDesc = ascDesc;
        this.ignoreCase = ignoreCase;
    }
    @Override
    public int compare(City o1, City o2) {
        if(this.ignoreCase){
            return this.ascDesc*o1.getName().compareToIgnoreCase(o2.getName());
        } else {
            return this.ascDesc*o1.getName().compareTo(o2.getName());
        }
    }
}

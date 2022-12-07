package service;

import data.EducationGroup;
import data.People;
import data.Stream;
import java.util.Comparator;

public class StreamComparator implements Comparator<People>{
    @Override
    public int compare(People p1, People p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

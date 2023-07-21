package collectionframework.listinterfaceclasses.comparatorinlistinterface;

import java.util.Comparator;

public class SortByNameInDescendingOrder implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student s1=(Student)o1;
        Student s2=(Student)o2;
        String roll1=s1.getName();
        String roll2=s2.getName();

        return roll2.compareTo(roll1);
    }
}

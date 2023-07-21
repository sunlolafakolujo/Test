package collectionframework.listinterfaceclasses.comparatorinlistinterface;

import java.util.Comparator;

public class SortByRollNumberInDescendingOrder implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student I1=(Student) o1;
        Student I2=(Student) o2;
        Integer roll1= I1.getRollNumber();
        Integer roll2=I2.getRollNumber();
        return roll2.compareTo(roll1);
    }
}

package collectionframework.setinterface.comparator;

import java.util.Comparator;

public class MyTreeSetComparatorDescendingOrder implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer I1=(Integer)o1;
        Integer I2=(Integer)o2;

        return -I1.compareTo(I2);
    }
}

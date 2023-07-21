package collectionframework.mapinterface;

import java.util.Comparator;

public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        String s1 = o1.toString();
        String s2 = o2.toString();

        return s2.compareTo(s1);//descending order
//        return -1;//reverse sorting order
//        return +1;//natural sorting order
    }
}

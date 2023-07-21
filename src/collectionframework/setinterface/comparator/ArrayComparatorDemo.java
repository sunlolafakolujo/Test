package collectionframework.setinterface.comparator;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayComparatorDemo {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(10);
        list.add(70);
        list.add(60);
        list.add(1);
        Collections.sort(list,new MyComparator());
        System.out.println(list);
    }
}

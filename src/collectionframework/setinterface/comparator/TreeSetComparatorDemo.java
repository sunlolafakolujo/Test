package collectionframework.setinterface.comparator;

import java.util.TreeSet;

public class TreeSetComparatorDemo {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet(new MyComparator());
        treeSet.add(10);
        treeSet.add(0);
        treeSet.add(15);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(20);
        System.out.println(treeSet);
    }
}

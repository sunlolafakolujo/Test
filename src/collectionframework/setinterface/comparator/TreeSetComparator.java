package collectionframework.setinterface.comparator;

import java.util.TreeSet;

public class TreeSetComparator {
    public static void main(String[] args) {
    new TreeSetComparator().naturalSortingOrder();
    new TreeSetComparator().reverseSortingOrder();

    }

    public void naturalSortingOrder(){
        TreeSet t=new TreeSet(new MyTreeSetComparatorNaturalSortingOrder());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
        System.out.println(t);
    }

    public void reverseSortingOrder() {
        TreeSet t =new TreeSet(new MyTreeSetComparatorDescendingOrder());

        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
        System.out.println(t);
    }
}

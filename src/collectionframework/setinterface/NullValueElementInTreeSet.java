package collectionframework.setinterface;

import java.util.TreeSet;

public class NullValueElementInTreeSet {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet();
        treeSet.add(null);
        System.out.println(treeSet);
    }
}

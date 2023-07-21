package collectionframework.setinterface;

import java.util.TreeSet;

public class TreeSetStringBufferDemo {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet();
        treeSet.add(new StringBuffer("A"));
        System.out.println(treeSet);
//        treeSet.add(new String("B"));
//        System.out.println(treeSet);
    }
}

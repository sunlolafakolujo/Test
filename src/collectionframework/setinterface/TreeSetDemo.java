package collectionframework.setinterface;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet(); //NavigableSet<E>, Cloneable, java.io.Serializable

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);

        TreeSet treeSet1=new TreeSet();
        treeSet1.add(4);
        treeSet1.add(5);
        treeSet1.add(6);

        System.out.println(treeSet);
        System.out.println(treeSet.subSet(1,3));
        System.out.println(treeSet.isEmpty());
        System.out.println(treeSet.size());
        System.out.println(treeSet.add(4));
        System.out.println(treeSet.addAll(treeSet1));
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet1.add(8));
        System.out.println(treeSet.subSet(3,5));
        System.out.println(treeSet.ceiling(3));//returns assert 3
        System.out.println(treeSet.floor(7));//returns 7 or value before
        System.out.println(treeSet.contains(5));
        System.out.println(treeSet.headSet(4,true));
        System.out.println(treeSet.headSet(4));
        System.out.println(treeSet.tailSet(2,false));
        System.out.println(treeSet.tailSet(4));
        System.out.println(treeSet.higher(5));
        System.out.println(treeSet.remove(treeSet.last()));
        System.out.println(treeSet);
        System.out.println(treeSet.subSet(2,true,5,false));
        System.out.println(treeSet.higher(4));//returns value higher than the specified object
        System.out.println(treeSet.lower(3));//returns value lower than the specified object
        System.out.println(treeSet.pollFirst());//removes the first element
        System.out.println(treeSet.pollLast());//removes the last element
        System.out.println(treeSet);
        System.out.println(treeSet.ceiling(4));
        System.out.println(treeSet.descendingSet());

        System.out.println();
        Iterator m=treeSet.descendingSet().iterator();
        while(m.hasNext()){

             System.out.print(m.next()+" ");
        }
    }


}

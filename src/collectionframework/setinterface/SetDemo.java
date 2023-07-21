package collectionframework.setinterface;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        SortedSet s=new TreeSet();
        s.add(500);
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(5);
        s.add(4);
        s.add(6);
//        s.add("5");//Does not accept Heterogeneous variables else it will throw Runtime exception saying ClassCastException
        System.out.println(s.getClass().getName());
        System.out.println("Elements in the Tree: "+s);
        System.out.println("Tree size: "+s.size());
        System.out.println("Does the Tree contains 2: "+s.contains(2));
        System.out.println("Is the Tree empty?: "+s.isEmpty());
        System.out.println(s.comparator());
        System.out.println("Head Set: "+s.headSet(3));//value(s) before 3
        System.out.println("Tail Set: "+s.tailSet(3));//value(s) after 3, 3 inclusive
        System.out.println("Subset: "+s.subSet(3,6));//value(s) >=3 but less 6
        System.out.println("Last element in the set: "+s.last());
        System.out.println("First element in the set: "+s.first());
    }
}

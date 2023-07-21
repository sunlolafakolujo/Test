package collectionframework.listinterfaceclasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaceDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        Iterator it=list.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }

        System.out.println("\n"+"Size of the list: "+list.size());
        System.out.println("Remove first element: "+list.remove(0));
        System.out.println(list);
        System.out.println("Remove object 3 if present in the list: "+list.remove("3"));
        System.out.println(list);
        list.add("5");
        System.out.println("Element in index 2 in the list: "+list.get(2));
        System.out.println("Is the list empty?:"+list.isEmpty());
        System.out.println("Size of the list: "+list.size());
        System.out.println("Does list contains 3: "+list.contains("3"));
        list.clear();
        list.add("6");
        list.add("7");
        Iterator li= list.iterator();
        System.out.print("Elements in the list: ");
        while (li.hasNext()){
            System.out.print(li.next()+" ");
        }
    }
}

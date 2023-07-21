package collectionframework.listinterfaceclasses;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        System.out.println(list);
        System.out.println("First element: "+list.getFirst());
        System.out.println("Second element: "+list.get(0));
        System.out.println("Last element: "+list.getLast());
        System.out.println(list.size());
        list.add(2,3);
        System.out.println(list);
        System.out.println("Size of linkedList: "+list.size());
        list.set(10,13);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove();
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.clear();
        System.out.println(list);
        for (int i=1; i<=10; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.addLast(11);
        System.out.println(list);
        LinkedList l = (LinkedList) list.clone();
        System.out.println("Clone of list: "+l);
    }
}

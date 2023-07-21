package collectionframework.listinterfaceclasses;

import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector vector=new Vector();
        vector.add(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);
        vector.addElement(5);
        vector.addElement(6);
        vector.addElement(7);
        System.out.println(vector);
        System.out.println(vector.size());
        System.out.println(vector.firstElement());
        System.out.println(vector.get(1));
        System.out.println(vector.lastElement());
        System.out.println(vector.get(6));
        System.out.println(vector.elementAt(1));
        System.out.println(vector.indexOf(1));
        System.out.println(vector.remove(6));
        System.out.println(vector.removeElement(7));
        System.out.println(vector.capacity());
//        System.out.println(vector.elements());

        ListIterator ltr= vector.listIterator();
        System.out.println("List iterator implemented class name: "+ltr.getClass().getName());

        //forward direction
        while (ltr.hasNext()){
            System.out.print(ltr.next()+" ");
        }
        System.out.println();
        while (ltr.hasPrevious()){
            System.out.print(ltr.previous()+" ");
        }
    }
}

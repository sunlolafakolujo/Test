package collectionframework.listinterfaceclasses;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(1);
        al.add(13);
        al.add(2);
        al.add(3);
        al.add(5);
        al.add(4);
//        al.add(null);//this will throw NullPointerException elements should be homogeneous
//        al.add("name");//this will throw ClassCastException elements should be homogeneous

        System.out.println("insertion order list: "+al);
        Collections.reverse(al);
        System.out.println("insertion reversal: "+al);
        Collections.sort(al);
        System.out.println("default natural sorting Order: "+al);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("Customized sorting order: "+al);
        Collections.swap(al, 0,3);
        System.out.println("Swapped list: "+al);
        Collections.rotate(al, 2);
        System.out.println("Rotated list: "+al);
        System.out.println("Size of the Array list: "+al.size());
        System.out.println("Position of element 3: "+al.indexOf(3)+"\n");

        al.add(5);
        al.add(6);
        al.add(7);

        System.out.println("Position of element 5: "+al.indexOf(5));
        System.out.println("\n"+al);
        System.out.println(al.remove(5));
        System.out.println(al);
//        System.out.println(al.remove(7));
        System.out.println(al.contains(8));
        al.trimToSize();
        ArrayList al2=new ArrayList();
        al2.add(8);
        al2.add(9);
        al2.add(10);
        al2.add(11);
        al2.add(2);
        System.out.println(al2);
        al.add(6,al2);
        System.out.println(al);
        al.add(5,6);
        System.out.println(al);
//        al.remove(al2);
        al.retainAll(al2); //retains common elements in al and al2
        System.out.println(al);

        ArrayList l=new ArrayList();

        l.add(1);
        l.add(4);
        l.add(3);
        ArrayList l2=new ArrayList();
        l2.add(4);
        l2.add(5);
        l2.add(6);
        Collections.copy(l2,l);

        System.out.println(l2);
        System.out.println(l);

        Collections.sort(l);
        System.out.println(l);

        System.out.println(Collections.min(l));
        System.out.println(Collections.max(l2));
        ArrayList list1=new ArrayList();
        list1.add(1);
        list1.add(5);
        Collections.fill(list1,"Hello");
        System.out.println(list1);
        ArrayList list=new ArrayList();
        list.add(2);
        list.add(7);
        list.add(20);
        list.add(15);
        list.add(10);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        System.out.println(Collections.max(list));//output: 20
        System.out.println(Collections.min(list));//output: 2
        Collections.shuffle(list);
        System.out.println(list);
        Collections.shuffle(list,new Random());
        System.out.println(list);
    }
}

package collectionframework.mapinterface;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo3 {
    public static void main(String[] args) {
        Hashtable h=new Hashtable();

        h.put(new Test1(5),"AAA");
        h.put(new Test1(2),"BBB");
        h.put(new Test1(6),"CCCC");
        h.put(new Test1(15),"DDD");
        h.put(new Test1(23),"AAA");
        h.put(new Test1(16),"AAAA");
        System.out.println(h.keySet());
        System.out.println(h.entrySet());
        System.out.println(h.values());
        System.out.println(h);
        Enumeration e=h.elements();
        while (e.hasMoreElements()){
            System.out.print(e.nextElement()+" ");
        }
    }
}

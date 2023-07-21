package collectionframework.mapinterface;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        //IdentityHashMap uses object references(address)
        IdentityHashMap i=new IdentityHashMap();
        Integer I1=new Integer(10);
        Integer I2=new Integer(10);

        i.put(I1,"Sunlola");
        i.put(I2,"Lola");
        System.out.println(i);

        IdentityHashMap id=new IdentityHashMap();
        String s1=new String("Sunl");
        String s2=new String("Sunl");
        id.put(s1,"Sunlola");
        id.put(s2,"Lolade");
        System.out.println(id);
    }
}

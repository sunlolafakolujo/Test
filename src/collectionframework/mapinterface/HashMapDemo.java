package collectionframework.mapinterface;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        Integer I1=new Integer(10);
        Integer I2=new Integer(10);

        //HashMap uses content references
        HashMap h=new HashMap();
        h.put(I1,"Sunlola");
        h.put(I2,"Akinlola");
        System.out.println(h);
    }
}

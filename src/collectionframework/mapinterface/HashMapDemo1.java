package collectionframework.mapinterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(101,"Dolapo");
        map.put(102,"Kunle");
        map.put(103,"Lola");

        System.out.println(map);
        System.out.println(map.put(101,"Lapo"));
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.hashCode());
        System.out.println(map.entrySet());
        System.out.println(map.get(103));
        System.out.println();
        Iterator ltr=map.entrySet().iterator();
        //or
        /*Set set=map.entrySet();
        Iterator ltrs=set.iterator();
         */

        while (ltr.hasNext()){
            Map.Entry m=(Map.Entry)ltr.next();
            if (m.getKey().equals(103)){
                m.setValue("Akinlola");
            }
        }
        System.out.println(map);
    }
}

package collectionframework.mapinterface;

import com.sun.source.tree.Tree;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.put(101,"AAAA");
        map.put(102,"Sunlola");
        map.put(103,"BBBB");
        map.put(104,"Dolapo");
        map.put(105,"XXXXX");

        System.out.println(map);
        //map.put("FFF","AAAA");//Will throw ClassCastException
//        System.out.println(map);
//        map.put(null,"AAAAA");//will throw NullPointerException
//        System.out.println(map);
        System.out.println(map.firstKey());
        System.out.println(map.firstEntry());
        System.out.println(map.lastKey());
        System.out.println(map.lastEntry());
        System.out.println(map.size());
        System.out.println(map.headMap(104));
        System.out.println(map.headMap(104,true));//include 104
        System.out.println(map.tailMap(103));
        System.out.println(map.tailMap(103,false));//Exclude 103
        System.out.println(map.subMap(102,105));


    }
}

package collectionframework.mapinterface;

import java.util.TreeMap;

public class TreeSetCustomizedSorting {
    public static void main(String[] args) {
        TreeMap t=new TreeMap(new MyComparator());
        t.put("XXX",10);
        t.put("AAA",20);
        t.put("ZZZ",30);
        t.put("LLL",40);
        System.out.println(t);
        System.out.println(t.get("XXX"));
    }
}

package collectionframework.mapinterface;

import java.util.Hashtable;

public class HashtableDemo2 {
    public static void main(String[] args) {
        Hashtable h=new Hashtable();

        h.put(new Test(2),"AAA");
        h.put(new Test(35),"BBB");
        h.put(new Test(40),"CCCC");
        h.put(new Test(15),"DDD");
        h.put(new Test(23),"AAA");
        System.out.println(h);

        Hashtable h1=new Hashtable(2);
        h1.put(new Test(1),"KKK");
        h1.put(new Test(6),"YYY");
        h1.put(new Test(50),"ZZZ");
        System.out.println(h1);
    }
}

package cooncurrentcollection;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MyThread extends Thread {
    static ConcurrentHashMap<Integer, String> l = new ConcurrentHashMap<>();

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
            System.out.println("Child thread class");
            l.put(103,"Sunlola");
    }

    public static void main(String[] args) throws InterruptedException {
        l.put(101,"Fola");
        l.put(102,"PamPam");

        MyThread t=new MyThread();
        t.start();
        Set s=l.keySet();
        Iterator itr=s.iterator();
        while (itr.hasNext()){
            Integer I=(Integer) itr.next();
            System.out.println("Main thread iterate map and current entry is: "+ I);
            Thread.sleep(3000);
        }
        System.out.println(l);
    }
}

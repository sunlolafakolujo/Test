package collectionframework.listinterfaceclasses;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue p=new PriorityQueue();

        System.out.println(p.poll());//returns null
//        System.out.println(p.element());//throws NoSuchElementException
        int count=0;

        do{
            p.offer(count);
            count++;
        }while(count<=10);

        System.out.println(p);
        System.out.println("First in element: "+p.peek());
        System.out.println(p.poll());
        System.out.println(p.peek());
        System.out.println(p);
    }
}

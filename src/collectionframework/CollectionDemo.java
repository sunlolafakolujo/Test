package collectionframework;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);

        // Difference between HashSet1 and HashSet2
        primeNumbers.removeAll(oddNumbers);
        System.out.println("Difference : " + primeNumbers);

        int binaryNumber = 0b10010;
        System.out.println(binaryNumber);
        int octalNumber = 027;
        System.out.println(octalNumber);

        int decNumber = 34;
        System.out.println(decNumber);
        int hexNumber = 0x2F;
        System.out.println(hexNumber);

        String[] s={"Dog","Cat","Lion"};
        List<String> str= Arrays.asList(s);
        String str1=str.get(1);
        System.out.print("Element in s: "+str1+"\n");
        Iterator<String> animals= str.iterator();
        System.out.print("Animals: ");
        while (animals.hasNext()) {
            System.out.print(animals.next()+" ");
        }
        System.out.println("\n"+str.isEmpty());

        List<String> str2=new ArrayList<>();
        str2.add("Elephant");
        str2.add("Chicken");

        System.out.print(str2.remove(0)+"\n");
        System.out.println(str2.size());
        System.out.println(str2);
        str2.clear();
        System.out.println(str2);
        str2.add("Bird");
        str2.add("Fowl");
        System.out.println(str2);

        int index = str2.indexOf("Bird");
        System.out.println(index);
        str2.set(1,"Turkey");
        System.out.println("Element in index 1: "+str2.get(1));
        List<String> additional=new ArrayList<>();
        additional.addAll(str2);
        List<String> str3=new ArrayList<>();
        str3.add("Tiger");
        str3.add("snake");
        additional.addAll(str3);//from collection interface
        additional.addAll(0,str3);// applicable for List
        System.out.println("Elements in str2 and str3 are added to additional arraylist: "+additional);
        System.out.println(str2 instanceof Object);

        ListIterator<String> str4 = additional.listIterator();
        while (str4.hasNext()){
            System.out.print(str4.next()+" ");
        }

        ArrayList x=new ArrayList<>();
        x.add("A");
        x.add("B");
        x.add("C");
        x.add("D");
        x.add(10);
        x.add(11.6);

        for (Object y: x){
            System.out.print(y+" "+"\n");
        }
        int y=x.indexOf("d");//return -1 as lowercase d is not an element of the list
        System.out.println(y);
        ArrayList q=new ArrayList();

        LinkedList<String> lk=new LinkedList<>();
        lk.add("E");
        lk.add("F");
        lk.add("G");
        System.out.print("Linked List: "+lk+"\n");
        ArrayList<String> al=new ArrayList<>(lk);//Passed LinkedList to ArrayList
        System.out.println("Equivalent ArrayList: "+al);
    }
}

package array;

import collectionframework.mapinterface.MyComparator;

import java.util.*;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] numbers={1111,5,7,18,9,110,311,12,13,14,15};
        int count=0;
        do {
            System.out.print(numbers[count]+" ");
            count++;
        }while (count<numbers.length);
        System.out.println();

        String s="I am a winner";
        int count1=0;
        do {
            System.out.printf("%d %s %s %s %n",count1," - ",s.charAt(count1), " ");
            System.out.println();
            count1++;
        }while (count1<s.length());
        System.out.print("Number of characters in s: "+count1);
        System.out.println();
        int[] count2 = new int[10];

        for (int i = 0; i < count2.length; i++){
            count2[i]=i;
        }

        for (int j:count2){
            System.out.println(j);
        }
        System.out.println();
        Spliterator<Integer> s1=Arrays.spliterator(count2);
        s1.forEachRemaining((n)-> System.out.print(n+" "));
        System.out.println();
        System.out.print("Array before sorting: ");
        for (int num:numbers){
            System.out.print(num+" ");
        }
        System.out.println();
        Arrays.sort(numbers);
        System.out.print("Array after sorting: ");
        for (int i:numbers){
            System.out.print(i+" ");
        }
        System.out.println();

        String[] str={"a","j","Y","x", "b","X","c","k", "d", "e","Z"};
        System.out.print("Object Array before sorting: ");
        for (String i:str){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Object Array after sorting: ");
        Arrays.sort(str);

        for (String i: str){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Insertion point of f: ");
        System.out.print(Arrays.binarySearch(str,"f"));
        System.out.println();
        System.out.print("a index position is: ");
        System.out.print(Arrays.binarySearch(str,"a"));
        System.out.println();
        Arrays.sort(str,new ArrayComparatorDemo());

        for (String i: str){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Z index position is: ");
        System.out.print(Arrays.binarySearch(str,"Z",new ArrayComparatorDemo()));
        System.out.println();
        List arrayList= Arrays.asList(str);
        System.out.print(arrayList);
        System.out.println();
        Collections.sort(arrayList);
        System.out.print(arrayList);
        System.out.println();
        Collections.sort(arrayList,new MyComparator());
        System.out.print(arrayList);
        System.out.println();
        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println();
        Collections.sort(arrayList,Collections.reverseOrder(new MyArrayListComparatorDemo()));
        System.out.println();
        System.out.print(str.equals(arrayList));

        arrayList.set(0,"q");
        System.out.println();
        for(Object o:arrayList){
            System.out.print(o+" ");
        }
        System.out.println();
        for (String i: str){
            System.out.print(i+" ");
        }


    }
}

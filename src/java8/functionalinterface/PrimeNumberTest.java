package java8.functionalinterface;

import java.util.Arrays;
import java.util.List;

public class PrimeNumberTest {
    public static void main(String[] args) {
        PrimeNumber p=()->{
            System.out.print("Prime numbers: ");
            for (int i=0; i<=10; i++){
                if (i%2==0){
                    System.out.print(i+" ");
                }
            }
        };
        p.primeNumber();
        System.out.println("");
        Integer[] a = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        List<Integer> list= Arrays.asList(a);
        list.stream().filter(x -> x%2 == 0).forEach(x1 -> System.out.println(x1));
    }
}

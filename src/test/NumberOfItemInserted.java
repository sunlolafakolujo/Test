package test;

import java.util.ArrayList;
import java.util.List;

public class NumberOfItemInserted {
    public static void main(String[] args) {
        List k=new ArrayList();
        int count=0;
        for(int i=0;i<=10;i++){
            k.add(i);
            count++;
        }
        System.out.print(k+" "+"\n");
        System.out.println(count);
    }
}

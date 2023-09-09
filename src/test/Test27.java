package test;

import java.util.Arrays;
import java.util.List;

public class Test27 {
    public static void main(String[] args) {
        int count=0;
        do{
            do {
                count++;
            }while(count<2);
            break;
        }while(true);
        System.out.println(count);
    }
}

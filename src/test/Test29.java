package test;

import java.util.Arrays;

public class Test29 {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args.length);

        String s=args[0];
        Arrays.sort(args);
        int r=Arrays.binarySearch(args,s);
        System.out.println(r);

    }
}

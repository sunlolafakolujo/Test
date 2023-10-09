package controlflow.forloop;

import java.util.Arrays;

public class ForLoopDemo {
    public static void main(String[] args) {
        int[] k=new int[]{2,7,4,5,19,40};
        for (int i = 0; i <k.length; i++) {
            System.out.printf("%d%3s%3d%n",i, "==",+k[i]);
        }
        System.out.println();
        System.out.println(Arrays.toString(k));
        System.out.println();
        System.out.printf("%s%n","Reverse");
        for (int i=k.length-1; i>=0; i--){
            System.out.print(k[i] + " ");
        }
    }
}

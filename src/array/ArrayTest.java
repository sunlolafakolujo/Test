package array;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arrays[] = new int[2][];
        System.out.println(arrays);
        System.out.println(arrays[0]);
        System.out.println(arrays.length);
//        System.out.println(arrays[0][0]);
        int[] arrays2=new int[]{2,6};
        int[][][] arrays3={{{1,2,3},{4,5,6}},{{7,8,9,10}}};
        System.out.println(Arrays.deepToString(arrays3));
        int total=0;
        for (int i=0; i<arrays3.length; i++){
            for (int j=0; j<arrays3[i].length;j++){
                for (int k=0; k<arrays3[i][j].length;k++){
                    System.out.print(arrays3[i][j][k]+" ");
                    total+=arrays3[i][j][k];
                }
            }
        }
        System.out.println("");
        System.out.println("Sum of number is: " + total);
        System.out.println();
        System.out.println(arrays3[0][0][2]);
        System.out.println(arrays3[0][1][1]);
        System.out.println("Array length: "+arrays3.length);

        System.out.printf("%s %s %s %n", "index", "index value", "index length");
        String[] arrays4 = new String[]{"A","BB","C","D","E","F"};
        for (int i =arrays4.length-1; i >=0 ; i--){
            System.out.printf("%d %s %d %n ",i, arrays4[i], arrays4[i].length());
        }
    }
}

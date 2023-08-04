package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryWithMultiplyCatchBlock {
    public static void main(String[] args) {
        int[] values ={1,2,3,4};
        try {
            System.out.println(10/0);
            System.out.println(values[3]);
            System.out.println();
            for (int i = 0; i <values.length; i++){
                System.out.print(values[i]+" ");
            }
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}

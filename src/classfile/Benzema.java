package classfile;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Benzema {
    public String convert(int value) {
//        return value.toString();
        return null;
    }

    public String convert(Integer value) {
        return value.toString();
    }

    public String convert(Object value) {
        return value.toString();
    }

    public static void main(String[] args){
        if(args.length>=1 &&(args[0].equals("sound") || args[0].equals("logic")) && args.length<2){
            System.out.println(args[0]);
        }
        String[] t=new String[]{"Mac","Linux","Windows"};
        Arrays.sort(t);
        System.out.println(Arrays.binarySearch(t,"Linux"));


    }
}

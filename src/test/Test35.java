package test;

import java.util.Arrays;

public class Test35 {
    static int min,max=100;
    public static void main(String[] args) {
        System.out.println(max - min);
//        StringBuilder sb=new StringBuilder();
//        for (String x:args){
//            sb.insert(sb.indexOf("c"),args);
//        }
//        System.out.println(sb);
        String[][] lists=new String[][]{{"book","34.99"},{"game","29.99"},{"pen",".99"}};
        System.out.println(lists.length+" "+lists[0].length);
        args=new String[]{"0","1","01","10"};
        Arrays.sort(args);
        System.out.println(Arrays.toString(args));
    }
}

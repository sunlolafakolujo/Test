package test;

import java.util.Set;

public class Test7 implements Cloneable{
    int i=10, j=20;
    public static void main(String... args) throws CloneNotSupportedException {
        Test7 t=new Test7();
        Test7 t1=(Test7)t.clone();
        t1.j=100;
        t1.i=50;
        System.out.println(t.i+"......... "+t.j);
        System.out.println(t1.i+"......... "+t1.j);
        String s="You cannot"+" change me";
        String s1=new String("You cannot"+" change me");
        String s2=s1.intern();
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s1==s2);
        String s3="You cannot"+" change me";
        System.out.println(s2==s3);
//        System.out.println(removeVowels("SunlolA"));
        long x=010l;
        double y=0X10Beef;
        System.out.println(x);
        System.out.println(y);
        short sh='a';
        System.out.println(sh);
        char ch=100;
        System.out.println(ch);
        int[] q;
        q=new int[5];

    }


//    public static String removeVowels(String str){
//        Set<Character> vowels=Set.of('a','e','i','o','u','A','E','I','O','U');
//        StringBuilder sb=new StringBuilder();
//        char[] chars=str.toCharArray();
//
//        for(char c:chars){
//            if(!vowels.contains(c)){
//                sb.append(c);
//            }
//        }
//        return sb.toString();
//    }
}

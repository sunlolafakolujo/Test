package test;

public class Test6 {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer("hello world");
        StringBuffer sb2=new StringBuffer("hello world");
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.hashCode());
        System.out.println(sb2.hashCode());
    }
}

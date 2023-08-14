package test;

public class Test11 {
    public static void main(String[] args) {
        String s="Sunlola";
        String s1=new String("Sunlola");
        System.out.println(s==s1);
        System.out.println(s.equals(s1));

        String s2=new String(new StringBuffer("Sunlola"));
        System.out.println(s2==s1);
        System.out.println(s1.equals(s2));
        char[] ch={'a','b','c','d','e','f','g','h','i'};
        String s3=new String(ch);
        System.out.println(s3);
        char[] ch2=s3.toCharArray();
        System.out.println(ch2);
        byte[] b={100,101,102,103,104,105,106,107,108,97,99,98};
        String s4=new String(b);
        System.out.println(s4);
        char c="0123".charAt(0);
        System.out.println(c++ + ++c);
    }
}

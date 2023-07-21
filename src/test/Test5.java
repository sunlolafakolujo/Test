package test;

public class Test5 {
    public static void main(String... args){
        Integer x=100;
        Integer y=100;
        System.out.println(x==y);

        Integer z=new Integer(20);
        Integer w=20;
        System.out.println(z==w);//returns false(objects)
        System.out.println(z.equals(w));// returns true(contents)

        Integer k=1000;
        Integer l=1000;
        System.out.println(k==l);

        Long g=10l;
        System.out.println(g);
        long h=10;
        System.out.println(h);

        String s1=new String("durga");
        String s2=new String("durga");
        System.out.println(s1);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        String s3=s1;
        System.out.println(s3);
        System.out.println(s3.hashCode());
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
}

package test;

public class Test10 {
    public static void main(String[] args) {

        int x =10; int y =15;
        if (++x<10 & ++y>15){
            ++x;
        }else{
            ++y;
        }
        System.out.println(x+" ...... "+y);

        if (++x<10 | ++y>15){
            ++x;
        }else{
            ++y;
        }
        System.out.println(x+" ...... "+y);

        if (++x<10 && ++y>15){ //evaluate first condition
            ++x;
        }else{
            ++y;
        }
        System.out.println(x+" ...... "+y);

        if (++x<10 || ++y>15){
            ++x;
        }else{
            ++y;
        }
        System.out.println(x+" ...... "+y);


            String s1 = "hello";
            String s2 = new String("hello");

            s2 = s2.intern();//scp: hello
            System.out.println(s1 == s2);
    }
}

package test;

public class Test8 {
    public static void main(String[] args)  {
        int x=10;
        if (++x<10 && ((x/0) >10)){
            System.out.println("Hello");
        }else{
            System.out.println("Hi");
        }

        if (++x<10 || ((x/0) >10)){
            System.out.println("Hello");
        }else{
            System.out.println("Hi");
        }
        System.out.println("Parent main function");

//        int y=x>0?10:1;
//        System.out.println(y);
//        System.out.println(4 * 3/2+5*6);
    }
}

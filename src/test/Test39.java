package test;

public class Test39 {
    public static void main(String[] args) {
//       int x=10;
//       if (++x<10 || (x/0>10)) {
//           System.out.println("hello");
//       }else System.out.println("Hi");

       byte a=10;
       switch (a+1) {
           case 10:
               System.out.println(10);
           case 11:
               System.out.println(100);
               break;
           case 1000:
               System.out.println(1000);
           default:
               System.out.println(11);
       }
    }

}

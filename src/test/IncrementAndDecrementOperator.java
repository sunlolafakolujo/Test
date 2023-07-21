package test;

public class IncrementAndDecrementOperator {

    public static void main(String... args){
        int a=7;
        int y=++a;
        int x=a++;
        byte b=1;
        double c=0.0;
        byte d=(byte)(b+c);
        System.out.println(d);
        int k=6;
        double i=10.0;
        double j=-10.0;
        long l=3;
        double p=0.0;
//        boolean r= l==null || p<10 ;
//        boolean value= l && k;

        System.out.println("a= "+a+" b= "+y);
        System.out.println("a= "+a+" x= "+x);
        System.out.println("b "+b+" c= "+c);
        System.out.println("b/c= "+b/c);
        System.out.println("i/k= "+i/k);
        System.out.println("j/k= "+j/k);
        System.out.println("k/l= "+k/l);
        System.out.println("p/l= "+p/l);
        System.out.println("p/l= "+-p/l);

    }
}

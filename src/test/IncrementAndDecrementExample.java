package test;

public class IncrementAndDecrementExample {
    public static void main(String[] args){
        int i=6;
        long l=5>=5?1+2:1*1;
        if (++l < 4){
            l+=1;
        }
//        System.out.println(l);
        double d=130.456;
        byte b=(byte)d;
        byte f=(byte)132;
//        System.out.println(b);
//        f &=20;
//        f +=4;
        System.out.println("f: "+f);

        int e,g,h,j,k;
        g=2; h=4; j=6; k=5;
        e=g + h * j/2 - k;
        System.out.println("value of e: "+e);

    }
}

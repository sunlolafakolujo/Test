package test;

public class BitWiseVsShortCircuit {
    public static void main(String[] args){
        int x=10,  y=15;
        if (++x<10 && ++y>15){
            x++;
        }else{
            y++;
        }
        System.out.println("x="+x+" y="+y);
        byte b=120;
//        b=(byte)(b+1);
        b+=3;

        System.out.println("b="+b);
    }
}

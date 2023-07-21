package test;

public class Operand {
    public static void main(String[] args){
//        System.out.println(mi(2)+mi(4)*mi(16)/mi(4)+mi(16)+mi(19));

        System.out.println(m(new double[]{1,2,7,80}));

    }
    public static int mi(int x){
        System.out.println(x);
        return x;
    }

    public static double m(double[] arr){
        double a=Double.NEGATIVE_INFINITY;

        for (double i:arr){
            if (i>a){
                a=i;
//                a+=1;
            }
        }
        return a;
    }
}

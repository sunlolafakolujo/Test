package test;

public class Test2 {
    public static void main(String[] args){
        mi(10,20);
    }

    private static void mi(final int i, int j) {
//        i=100; // cannot assign a value to final variable x.
        j=200;
        System.out.println(i+" .......... "+j);
        String chair="Good Good", table="Good";

        System.out.println(chair);

    }

    public String convert(Object i){
        return i.toString();
    }
}

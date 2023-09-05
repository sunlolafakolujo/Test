package wrapperobject;

public class WrapperClassDemo3 {
    public static void main(String[] args) {
        Integer X = 10;
        Integer Y = X;
        X++;
        System.out.println(X + " " + Y);

        Integer I = new Integer(10);
        Integer I2 = new Integer("10");
        System.out.println(I == I2);
        System.out.println(I.equals(I2));

        Double I3 = 10.0;
        Double I4 = 10.0;
        System.out.println(I3 == I4);
        System.out.println(I3.equals(I4));
        int x = 10;
//        m1(x);//CE: incompatible type

        String tr = new String("10");
        String trs = new String("10");
        System.out.println(tr.equals(trs));
        System.out.println(tr.hashCode() == (trs.hashCode()));
    }

    public static void m1(Long x) {
        System.out.println("Long");

    }
}

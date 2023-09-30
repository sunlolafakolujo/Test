package test;

public class Clown extends Test34{
    public final Clown getFish(){
        throw new RuntimeException();
    }
    public static void main(String[] args) {
        final Test34 t=new Clown();
//        t.getFish();
        System.out.println("swim");
    }
}

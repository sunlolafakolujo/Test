package test;

public class Test22 extends Test21{
    {
        System.out.println("4");
    }
    public Test22() {
        super("blue");
        System.out.println("5");
    }

    public static void main(String[] args) {
       new Test22();
    }
}

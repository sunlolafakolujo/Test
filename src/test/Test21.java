package test;

public abstract class Test21 {
    static {
        System.out.println("1");
    }
    public Test21(String name) {
        System.out.println("2");
    }
    {
        System.out.println("3");
    }
}

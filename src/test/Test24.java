package test;

public interface Test24 {
    default void walk() {
        System.out.println("Testing");
    }

    public void m1();

    static void test() {}

}



package oopsconcepts.polymorphism.overloading;

public class OverloadingConcept {
    private static final int add(int a, int b) {
        return a + b;
    }

    public void add(int a, long b) {
        System.out.println(a + b);
    }

    protected double add(double a) {
        return a;
    }

    static float add(float a, float b) {
        return a + b;
    }

    private strictfp double add(float a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingConcept o = new OverloadingConcept();
        System.out.println(o.add(2, 4));
        o.add(2, 5l);
        o.add(2);
        System.out.println(o.add(2.5f, 5.2f));
        System.out.println(o.add(2f, 8.9));
    }
}

package test;

public class Test14 {
    public static void main(String[] args) {
        boolean baloonInflated = false;
        do {
            if (!baloonInflated) {
                baloonInflated = true;
                System.out.println("Inflate-");
            }
        } while (baloonInflated);

        System.out.println("done");
    }
}

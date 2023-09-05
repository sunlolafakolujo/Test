package test;

public class Test19 {
    public Long operate() throws Exception {
        try {
            String ch=(String) new Object();
        }catch (Exception e) {
            throw new RuntimeException("Test19");
        }
        return null;
    }

    public static void main(String[] args) {
        try {
            new Test19().operate();
            System.out.println("Finished!");
        }catch (Throwable t) {}
    }
}

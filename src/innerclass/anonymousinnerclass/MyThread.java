package innerclass.anonymousinnerclass;

public class MyThread {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }

        Thread m = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child thread started");
                }
            }
        };

        m.start();
    }
}

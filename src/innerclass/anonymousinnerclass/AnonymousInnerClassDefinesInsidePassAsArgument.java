package innerclass.anonymousinnerclass;

public class AnonymousInnerClassDefinesInsidePassAsArgument {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            public void run() {
                for (int i=0; i<10; i++) {
                    System.out.println("Anonymous define pass as argument");
                }
            }
        });

        t.start();

        for (int i=0; i<10; i++) {
            System.out.println("Main thread");
        }
    }
}

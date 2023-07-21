package classfile;

public class GCDemo {
    static int count=0;
    public static void main(String[] args) {

        for (int i=0; i<1000000000; i++) {
            GCDemo demo=new GCDemo();
            demo=null;
        }
    }
    public void finalize() {
        System.out.println("Final method called "+ ++count);
    }
    public String toString() {
        return "GCDemo";
    }
}

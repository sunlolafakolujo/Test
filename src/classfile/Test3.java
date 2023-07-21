package classfile;

public class Test3 {
    int i;
    public Test3(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        Test3 t=new Test3(3);
        t=null;
        System.gc();
        System.out.println(t);
    }

    @Override
    public String toString() {
        return "Test3{" +
                "i=" + i +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

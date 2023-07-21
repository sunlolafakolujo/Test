package classfile;

public class Concrete extends AdapterX{
    @Override
    public void write() {
        System.out.println("Hello I can write");
    }

    public static void main(String... args) {
        Concrete x = new Concrete();
        x.write();
    }
}

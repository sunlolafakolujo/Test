package exceptions;

public class Test3 {
    public static void main(String[] args) {
        new Test3().openDrawbridge();
    }

    public void openDrawbridge() {
        try {
            throw new Exception("Test");
        }catch (RuntimeException e) {
            throw new DragoException();

        }finally {
            throw new RuntimeException();
        }
    }
}

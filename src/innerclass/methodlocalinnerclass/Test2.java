package innerclass.methodlocalinnerclass;

public class Test2 {
    public class InnerTestClass {
        public void main() {
            System.out.println("Inner Class method");
        }
    }

    public static void main(String[] args) {

        Test2 test2 = new Test2();
        Test2.InnerTestClass ti = test2.new InnerTestClass();
        ti.main();
    }
}

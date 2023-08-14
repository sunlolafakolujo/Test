package innerclass.methodlocalinnerclass;

public class MethodLocalClassDemo3 {
    public void m1(){
        int x = 10;
        class Inner{
            public  void m2(){
                System.out.println(x);
            }
        }
        Inner inner=new Inner();
        inner.m2();
    }

    public static void main(String[] args) {
        MethodLocalClassDemo3 m=new MethodLocalClassDemo3();
        m.m1();
    }
}

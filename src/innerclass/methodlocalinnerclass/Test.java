package innerclass.methodlocalinnerclass;

public class Test {
    int x=10;
    static int y=20;
    public void m1(){
        class InnerClassMethod{
            public static void m2(){
                System.out.println(y);
//                System.out.println(x);//CE: Non-static variable x cannot be referenced from a static context
            }
        }
        InnerClassMethod m = new InnerClassMethod();
        m.m2();
    }

    public static void main(String[] args) {

        Test t=new Test();
        System.out.println(t.x);
        t.m1();
    }
}
